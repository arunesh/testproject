
package com.chaibytes.test.testapplication.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductSearchModeSmartString3 {

    @SerializedName("default")
    @Expose
    private String _default;
    @SerializedName("US")
    @Expose
    private US___________ uS;

    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    public US___________ getUS() {
        return uS;
    }

    public void setUS(US___________ uS) {
        this.uS = uS;
    }

}
