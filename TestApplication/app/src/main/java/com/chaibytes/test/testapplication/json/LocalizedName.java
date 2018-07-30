package com.chaibytes.test.testapplication.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class LocalizedName {
    public LocalizedName() {
        localeMap = new HashMap<>();
    }

    private String defaultString;

    private Map<String, String> localeMap;

    public String getDefault() {
        return defaultString;
    }

    public Map<String, String> getLocaleMap() {
        return localeMap;
    }

    public void addLocaleString(String key, String value) {
        localeMap.put(key, value);
    }

    public void addDefaultLocaleString(String value) {
        defaultString = value;
    }
}
