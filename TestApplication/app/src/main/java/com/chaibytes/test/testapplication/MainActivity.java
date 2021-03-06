package com.chaibytes.test.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.chaibytes.test.testapplication.json.LocalizedName;
import com.chaibytes.test.testapplication.json.LocalizedNameAdapter;
import com.chaibytes.test.testapplication.json.ModesConfigParser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MODESJSON";
    private static final String MODES_URL = "https://d1s44l2n6n3ub3.cloudfront.net/production/A9VisualSearchConfig.json";
    private TextView mTextView;
    private Gson gson;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createGson();

        mTextView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadModesConfig();
            }
        });

    }

    private void createGson() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(LocalizedName.class, new LocalizedNameAdapter());
        gson = builder.create();
    }

    public void downloadModesConfig() {
        // Instantiate the RequestQueue .
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = MODES_URL;

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        mTextView.setText("Response is: "+ response.substring(0,500));
                        Log.i(TAG, "Response:"+ response);
                        ModesConfigParser output = gson.fromJson(response, ModesConfigParser.class);
                        output.addSmartStrings(gson, response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mTextView.setText("That didn't work!");
            }
        });
        queue.add(stringRequest);
    }
}
