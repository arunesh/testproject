
package com.chaibytes.test.testapplication.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ModesConfigParser {

    @SerializedName("version")
    @Expose
    private String version;

    @SerializedName("FailureLandingPage")
    //@Expose
    private FailureLandingPage failureLandingPage;

    @SerializedName("modes")
    @Expose
    private Modes modes;
    @SerializedName("modesOrder")
    @Expose
    private ModesOrder modesOrder;
    @SerializedName("product_search")
    @Expose
    private IndividualModes productSearch;
    @SerializedName("augmented_reality")
    @Expose
    private IndividualModes augmentedReality;
    @SerializedName("giftcard")
    @Expose
    private IndividualModes giftcard;
    @SerializedName("package_xray")
    @Expose
    private IndividualModes packageXray;
    @SerializedName("barcode_scanner")
    @Expose
    private IndividualModes barcodeScanner;
    @SerializedName("bookstore")
    @Expose
    private IndividualModes bookstore;
    @SerializedName("smile_code")
    @Expose
    private IndividualModes smileCode;
    @SerializedName("hardlines")
    //@Expose
    private IndividualModes hardlines;
    @SerializedName("apparelhome")
    @Expose
    private IndividualModes apparelhome;

    private List<String> smartStringIds = new LinkedList<>();
    private Map<String, LocalizedName> smartStringIdMap = new HashMap<>();

    @SerializedName("stringOverrides")
    @Expose
    private StringOverrides stringOverrides;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public FailureLandingPage getFailureLandingPage() {
        return failureLandingPage;
    }

    public void setFailureLandingPage(FailureLandingPage failureLandingPage) {
        this.failureLandingPage = failureLandingPage;
    }

    public Modes getModes() {
        return modes;
    }

    public void setModes(Modes modes) {
        this.modes = modes;
    }

    public ModesOrder getModesOrder() {
        return modesOrder;
    }

    public void setModesOrder(ModesOrder modesOrder) {
        this.modesOrder = modesOrder;
    }

    public IndividualModes getProductSearch() {
        return productSearch;
    }

    public IndividualModes getAugmentedReality() {
        return augmentedReality;
    }

    public IndividualModes getGiftcard() {
        return giftcard;
    }

    public IndividualModes getPackageXray() {
        return packageXray;
    }

    public IndividualModes getBarcodeScanner() {
        return barcodeScanner;
    }

    public IndividualModes getBookstore() {
        return bookstore;
    }


    public IndividualModes getSmileCode() {
        return smileCode;
    }


    public IndividualModes getHardlines() {
        return hardlines;
    }


    public IndividualModes getApparelhome() {
        return apparelhome;
    }


    public StringOverrides getStringOverrides() {
        return stringOverrides;
    }

    public void setStringOverrides(StringOverrides stringOverrides) {
        this.stringOverrides = stringOverrides;
    }

    public List<String> getSmartStringIds() {
        return smartStringIds;
    }

    public void populateStringList() {
        // Adding smart strings for each mode
        smartStringIds.addAll(productSearch.getSmartStringIds());
        //TODO: all for all modes
//        smartStringIds.addAll(.getSmartStringIds());
    }

    public void addSmartStrings(Gson gsonParser, String configJson) {
        populateStringList();
        List<String> listOfSmartStrings = getSmartStringIds();

        try {
            JSONObject jsonObject = new JSONObject(configJson);

            for (String smartId : listOfSmartStrings) {
                LocalizedName smartIdName =
                        gsonParser.fromJson(jsonObject.getString(smartId), LocalizedName.class);
                smartStringIdMap.put(smartId, smartIdName);
            }

        } catch (JSONException ex) {
            // Print some error message
        }

    }

    public Map<String, LocalizedName> getSmartStringIdMap () {
        return smartStringIdMap;
    }

}
