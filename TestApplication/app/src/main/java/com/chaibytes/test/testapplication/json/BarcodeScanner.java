
package com.chaibytes.test.testapplication.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BarcodeScanner {

    @SerializedName("modeId")
    @Expose
    private String modeId;
    @SerializedName("modeDisplayNameId")
    @Expose
    private String modeDisplayNameId;
    @SerializedName("modeDescriptionId")
    @Expose
    private String modeDescriptionId;
    @SerializedName("smartStringIds")
    @Expose
    private List<String> smartStringIds = null;

    public String getModeId() {
        return modeId;
    }

    public void setModeId(String modeId) {
        this.modeId = modeId;
    }

    public String getModeDisplayNameId() {
        return modeDisplayNameId;
    }

    public void setModeDisplayNameId(String modeDisplayNameId) {
        this.modeDisplayNameId = modeDisplayNameId;
    }

    public String getModeDescriptionId() {
        return modeDescriptionId;
    }

    public void setModeDescriptionId(String modeDescriptionId) {
        this.modeDescriptionId = modeDescriptionId;
    }

    public List<String> getSmartStringIds() {
        return smartStringIds;
    }

    public void setSmartStringIds(List<String> smartStringIds) {
        this.smartStringIds = smartStringIds;
    }

}
