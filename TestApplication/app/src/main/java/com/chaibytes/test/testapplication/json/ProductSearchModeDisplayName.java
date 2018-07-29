
package com.chaibytes.test.testapplication.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductSearchModeDisplayName {

    @SerializedName("default")
    @Expose
    private String _default;
    @SerializedName("US")
    @Expose
    private US_ uS;

    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    public US_ getUS() {
        return uS;
    }

    public void setUS(US_ uS) {
        this.uS = uS;
    }

}
