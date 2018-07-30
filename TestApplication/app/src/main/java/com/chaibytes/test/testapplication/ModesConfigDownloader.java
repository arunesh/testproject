package com.chaibytes.test.testapplication;

import android.content.Context;
import android.support.annotation.NonNull;

import com.chaibytes.test.testapplication.json.ModesConfigParser;

/**
 * Class to download the JSON config file for Modes Config.
 *
 */

public class ModesConfigDownloader {
    private static ModesConfigDownloader sInstance = null;
    private static ModesConfigParser mModesConfigJSON = null;

    public static synchronized ModesConfigDownloader downloadJSONConfig
            (@NonNull Context context) {
        if (sInstance == null) {
            // Download done in also instantiating and this helps avoid
            // storing context unnecessarily.
            sInstance = new ModesConfigDownloader(context);
        }

        return sInstance;
    }

    private ModesConfigDownloader(@NonNull Context context) {
        mModesConfigJSON = ModesConfigDownloaderUtil.getInstance(context).readJSONFileContents(
                ModesConfigDownloadedConstants.s3DownloadURL, ModesConfigDownloadedConstants.localfilename,
                ModesConfigParser.class, context);
    }

    /**
     * Get the ModesConfigParser class from the downloaded config
     *
     * @return ModesConfigParser
     */
    public static ModesConfigParser getRegistryJSON() {
        return mModesConfigJSON;
    }

}
