
package com.chaibytes.test.testapplication.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class US_________ {

    @SerializedName("en_US")
    @Expose
    private String enUS;
    @SerializedName("es_US")
    @Expose
    private String esUS;

    public String getEnUS() {
        return enUS;
    }

    public void setEnUS(String enUS) {
        this.enUS = enUS;
    }

    public String getEsUS() {
        return esUS;
    }

    public void setEsUS(String esUS) {
        this.esUS = esUS;
    }

}
