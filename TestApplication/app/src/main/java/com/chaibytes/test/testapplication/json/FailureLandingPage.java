
package com.chaibytes.test.testapplication.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FailureLandingPage {

    @SerializedName("displayContent")
    @Expose
    private List<DisplayContent> displayContent = null;

    public List<DisplayContent> getDisplayContent() {
        return displayContent;
    }

    public void setDisplayContent(List<DisplayContent> displayContent) {
        this.displayContent = displayContent;
    }

}
