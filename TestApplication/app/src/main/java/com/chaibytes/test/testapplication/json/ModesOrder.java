
package com.chaibytes.test.testapplication.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModesOrder {

    @SerializedName("default")
    @Expose
    private Default _default;
    @SerializedName("US")
    @Expose
    private US uS;

    public Default getDefault() {
        return _default;
    }

    public void setDefault(Default _default) {
        this._default = _default;
    }

    public US getUS() {
        return uS;
    }

    public void setUS(US uS) {
        this.uS = uS;
    }

}
