
package com.chaibytes.test.testapplication.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AugmentedReality {

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
    private List<Object> smartStringIds = null;

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

    public List<Object> getSmartStringIds() {
        return smartStringIds;
    }

    public void setSmartStringIds(List<Object> smartStringIds) {
        this.smartStringIds = smartStringIds;
    }

}
