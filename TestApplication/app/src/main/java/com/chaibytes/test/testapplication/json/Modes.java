
package com.chaibytes.test.testapplication.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Modes {

    @SerializedName("onBoardingTutorialVideoURL")
    @Expose
    private String onBoardingTutorialVideoURL;
    @SerializedName("localeSpecificTutorialVideoURLs")
    @Expose
    private LocaleSpecificTutorialVideoURLs localeSpecificTutorialVideoURLs;
    @SerializedName("onBoardingTutorialImageURL")
    @Expose
    private String onBoardingTutorialImageURL;
    @SerializedName("onBoardingProductSearchSampleImageURL")
    @Expose
    private String onBoardingProductSearchSampleImageURL;
    @SerializedName("onBoardingSearchResultsImageURL")
    @Expose
    private String onBoardingSearchResultsImageURL;
    @SerializedName("durationInDaysAfterWhichToPromptUserToSelectMode")
    @Expose
    private String durationInDaysAfterWhichToPromptUserToSelectMode;
    @SerializedName("searchTimeOut")
    @Expose
    private String searchTimeOut;
    @SerializedName("searchTimeOutAfterGuidance")
    @Expose
    private String searchTimeOutAfterGuidance;
    @SerializedName("accumulationTimeOut")
    @Expose
    private String accumulationTimeOut;
    @SerializedName("searchTimeOutForBarcodeMode")
    @Expose
    private String searchTimeOutForBarcodeMode;
    @SerializedName("searchTimeOutAfterGuidanceForBarcodeMode")
    @Expose
    private String searchTimeOutAfterGuidanceForBarcodeMode;
    @SerializedName("accumulationTimeOutForBarcodeMode")
    @Expose
    private String accumulationTimeOutForBarcodeMode;
    @SerializedName("photoUploadCropBufferPercentage")
    @Expose
    private String photoUploadCropBufferPercentage;
    @SerializedName("photoUploadDelayTimer")
    @Expose
    private String photoUploadDelayTimer;

    public String getOnBoardingTutorialVideoURL() {
        return onBoardingTutorialVideoURL;
    }

    public void setOnBoardingTutorialVideoURL(String onBoardingTutorialVideoURL) {
        this.onBoardingTutorialVideoURL = onBoardingTutorialVideoURL;
    }

    public LocaleSpecificTutorialVideoURLs getLocaleSpecificTutorialVideoURLs() {
        return localeSpecificTutorialVideoURLs;
    }

    public void setLocaleSpecificTutorialVideoURLs(LocaleSpecificTutorialVideoURLs localeSpecificTutorialVideoURLs) {
        this.localeSpecificTutorialVideoURLs = localeSpecificTutorialVideoURLs;
    }

    public String getOnBoardingTutorialImageURL() {
        return onBoardingTutorialImageURL;
    }

    public void setOnBoardingTutorialImageURL(String onBoardingTutorialImageURL) {
        this.onBoardingTutorialImageURL = onBoardingTutorialImageURL;
    }

    public String getOnBoardingProductSearchSampleImageURL() {
        return onBoardingProductSearchSampleImageURL;
    }

    public void setOnBoardingProductSearchSampleImageURL(String onBoardingProductSearchSampleImageURL) {
        this.onBoardingProductSearchSampleImageURL = onBoardingProductSearchSampleImageURL;
    }

    public String getOnBoardingSearchResultsImageURL() {
        return onBoardingSearchResultsImageURL;
    }

    public void setOnBoardingSearchResultsImageURL(String onBoardingSearchResultsImageURL) {
        this.onBoardingSearchResultsImageURL = onBoardingSearchResultsImageURL;
    }

    public String getDurationInDaysAfterWhichToPromptUserToSelectMode() {
        return durationInDaysAfterWhichToPromptUserToSelectMode;
    }

    public void setDurationInDaysAfterWhichToPromptUserToSelectMode(String durationInDaysAfterWhichToPromptUserToSelectMode) {
        this.durationInDaysAfterWhichToPromptUserToSelectMode = durationInDaysAfterWhichToPromptUserToSelectMode;
    }

    public String getSearchTimeOut() {
        return searchTimeOut;
    }

    public void setSearchTimeOut(String searchTimeOut) {
        this.searchTimeOut = searchTimeOut;
    }

    public String getSearchTimeOutAfterGuidance() {
        return searchTimeOutAfterGuidance;
    }

    public void setSearchTimeOutAfterGuidance(String searchTimeOutAfterGuidance) {
        this.searchTimeOutAfterGuidance = searchTimeOutAfterGuidance;
    }

    public String getAccumulationTimeOut() {
        return accumulationTimeOut;
    }

    public void setAccumulationTimeOut(String accumulationTimeOut) {
        this.accumulationTimeOut = accumulationTimeOut;
    }

    public String getSearchTimeOutForBarcodeMode() {
        return searchTimeOutForBarcodeMode;
    }

    public void setSearchTimeOutForBarcodeMode(String searchTimeOutForBarcodeMode) {
        this.searchTimeOutForBarcodeMode = searchTimeOutForBarcodeMode;
    }

    public String getSearchTimeOutAfterGuidanceForBarcodeMode() {
        return searchTimeOutAfterGuidanceForBarcodeMode;
    }

    public void setSearchTimeOutAfterGuidanceForBarcodeMode(String searchTimeOutAfterGuidanceForBarcodeMode) {
        this.searchTimeOutAfterGuidanceForBarcodeMode = searchTimeOutAfterGuidanceForBarcodeMode;
    }

    public String getAccumulationTimeOutForBarcodeMode() {
        return accumulationTimeOutForBarcodeMode;
    }

    public void setAccumulationTimeOutForBarcodeMode(String accumulationTimeOutForBarcodeMode) {
        this.accumulationTimeOutForBarcodeMode = accumulationTimeOutForBarcodeMode;
    }

    public String getPhotoUploadCropBufferPercentage() {
        return photoUploadCropBufferPercentage;
    }

    public void setPhotoUploadCropBufferPercentage(String photoUploadCropBufferPercentage) {
        this.photoUploadCropBufferPercentage = photoUploadCropBufferPercentage;
    }

    public String getPhotoUploadDelayTimer() {
        return photoUploadDelayTimer;
    }

    public void setPhotoUploadDelayTimer(String photoUploadDelayTimer) {
        this.photoUploadDelayTimer = photoUploadDelayTimer;
    }

}
