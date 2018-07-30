package com.chaibytes.test.testapplication;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.chaibytes.test.testapplication.json.LocalizedName;
import com.chaibytes.test.testapplication.json.LocalizedNameAdapter;
import com.google.common.io.CharStreams;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Class to download a JSON config file from URL
 *
 * Usage: Singleton class that can be used as follows:
 * ModesConfigDownloaderUtil.getInstance(context).readJSONFileContents(s3URL, fileName, clazz)
 * where clazz is the Java Object the json response can be parsed into
 */
public class ModesConfigDownloaderUtil {
        private static final String TAG = ModesConfigDownloaderUtil.class.getSimpleName();
        private static ModesConfigDownloaderUtil sInstance = null;
        private static RequestQueue mRequestQueue;
        private Gson mGson;
        private String mJSONString;
        private static final String DEFAULT_JSON_FILENAME = "config.json";
        private static boolean hasConfigBeenDownloaded = false;

        public static synchronized ModesConfigDownloaderUtil getInstance(Context context) {
            if (sInstance == null) {
                sInstance = new ModesConfigDownloaderUtil(context);
            }
            return sInstance;
        }

        private ModesConfigDownloaderUtil(Context context) {
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(LocalizedName.class, new LocalizedNameAdapter());
            mGson = builder.create();
            mRequestQueue = Volley.newRequestQueue(context);
        }

        /**
         * Passes the parsed JSON file content into the Object type passed.
         *
         * @param downloadURL URL to download the json file from
         * @param downloadFileName Name of the json file to be used in storing the file locally
         * @param clazz Generic class to read the JSON response object into
         * @return Object that contains the JSON data retrieved from the file
         */
        public <T> T readJSONFileContents(String downloadURL, String downloadFileName, Class<T> clazz,
                                          Context context) {
            loadJSONConfigFile(downloadURL, downloadFileName, context);

            return mGson.fromJson(mJSONString, clazz);
        }

        /**
         * Load the config file (if is in cache then read locally else download from server)
         *
         * @param downloadURL
         * @param downloadFileName
         */
        private void loadJSONConfigFile(String downloadURL, String downloadFileName, Context context) {
            if (!hasConfigBeenDownloaded) {
                // Download from Server
                downloadAndSaveJSONFile(downloadURL, downloadFileName, context);
            } else {
                // Read locally
                readConfigFileFromLocalStorage(downloadURL, downloadFileName, context);
            }
        }

        /**
         * Method to get back the JSON file content
         *
         * @param downloadURL that contains the S3 JSON download URL.
         * @param jsonFileName name of the json config file.
         */
        private void downloadAndSaveJSONFile(String downloadURL, final String jsonFileName,
                                             final Context context) {
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, downloadURL,
                    null, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject object) {
                    writeJSONContentToFile(object, jsonFileName, context);
                    mJSONString = object.toString();
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    Log.d(TAG, "Error downloading the JSON file");
                }
            });
            mRequestQueue.add(jsonObjectRequest);
        }

        /**
         * Write the JSON file fetched as a JSONObject into local storage
         *
         * @param jsonObject
         * @param jsonFileName
         */
        private void writeJSONContentToFile(JSONObject jsonObject, String jsonFileName, Context context) {
            File configFile = getConfigFile(jsonFileName, context);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(configFile);
                fileOutputStream.write(jsonObject.toString().getBytes());
                fileOutputStream.close();
                // Successfully downloaded once per session
                hasConfigBeenDownloaded = true;
            } catch (Exception e) {
                e.printStackTrace();
                Log.d(TAG, "Error writing JSON content to file.");
            }
        }

        /**
         * Get the local json config file as a File (default name used if none is provided)
         *
         * @param jsonFileName
         * @return File that represents the json file
         */
        private File getConfigFile(String jsonFileName, Context context) {
            String absFilePath = String.format("%s/%s", context.getFilesDir().getAbsolutePath(),
                    (jsonFileName != null) ? jsonFileName : DEFAULT_JSON_FILENAME);

            return new File(absFilePath);
        }

        /**
         * Reads the JSON config file from local storage
         *
         * @param downloadURL
         * @param jsonFileName
         */
        private void readConfigFileFromLocalStorage(String downloadURL, String jsonFileName,
                                                    Context context) {
            File configFile = getConfigFile(jsonFileName, context);

            if (configFile.exists() && configFile.canRead()) {
                try {
                    InputStream inputStream = new FileInputStream(configFile);
                    Reader reader = new InputStreamReader(inputStream);
                    mJSONString = CharStreams.toString(reader);
                    inputStream.close();
                } catch (Exception e) {
                    Log.e(TAG, "Error reading JSON file from local storage", e);
                }
            } else {
                downloadAndSaveJSONFile(downloadURL, jsonFileName, context);
            }
        }
    }
