
package com.chaibytes.test.testapplication.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductSearchModeSmartString1 {

    @SerializedName("default")
    @Expose
    private String _default;
    @SerializedName("US")
    @Expose
    private US_________ uS;

    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    public US_________ getUS() {
        return uS;
    }

    public void setUS(US_________ uS) {
        this.uS = uS;
    }

}
