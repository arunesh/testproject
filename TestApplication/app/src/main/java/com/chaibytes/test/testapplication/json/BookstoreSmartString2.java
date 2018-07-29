
package com.chaibytes.test.testapplication.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookstoreSmartString2 {

    @SerializedName("default")
    @Expose
    private String _default;
    @SerializedName("US")
    @Expose
    private US_________________ uS;

    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    public US_________________ getUS() {
        return uS;
    }

    public void setUS(US_________________ uS) {
        this.uS = uS;
    }

}
