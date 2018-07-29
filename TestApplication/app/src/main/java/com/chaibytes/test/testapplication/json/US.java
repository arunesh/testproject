
package com.chaibytes.test.testapplication.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class US {

    @SerializedName("defaultModeId")
    @Expose
    private String defaultModeId;
    @SerializedName("modeIdsList")
    @Expose
    private List<String> modeIdsList = null;

    public String getDefaultModeId() {
        return defaultModeId;
    }

    public void setDefaultModeId(String defaultModeId) {
        this.defaultModeId = defaultModeId;
    }

    public List<String> getModeIdsList() {
        return modeIdsList;
    }

    public void setModeIdsList(List<String> modeIdsList) {
        this.modeIdsList = modeIdsList;
    }

}
