package com.chaibytes.test.testapplication.json;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class LocalizedNameAdapter extends TypeAdapter<LocalizedName> {
    private static final String DEFAULT_LOCALE = "default";

    @Override
    public void write(JsonWriter out, LocalizedName value) throws IOException {
        // Should not come here. Add an exception.
    }

    @Override
    public LocalizedName read(JsonReader in) throws IOException {
        final LocalizedName localizedName = new LocalizedName();

        in.beginObject();
        while(in.hasNext()) {
            String key = in.nextName();
            if(!DEFAULT_LOCALE.equals(key)) {
                // Parse other locales
                in.beginObject();
                while (in.hasNext()) {
                    localizedName.addLocaleString(in.nextName(), in.nextString());
                }
                in.endObject();
            } else {
                localizedName.addDefaultLocaleString(in.nextString());
            }
        }
        in.endObject();

        return localizedName;
    }
}
