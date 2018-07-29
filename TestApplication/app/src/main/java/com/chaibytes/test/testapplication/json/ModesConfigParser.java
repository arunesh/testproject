
package com.chaibytes.test.testapplication.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModesConfigParser {

    @SerializedName("version")
    @Expose
    private String version;

    @SerializedName("FailureLandingPage")
    @Expose
    private FailureLandingPage failureLandingPage;

    @SerializedName("modes")
    @Expose
    private Modes modes;
    @SerializedName("modesOrder")
    @Expose
    private ModesOrder modesOrder;
    @SerializedName("product_search")
    @Expose
    private ProductSearch productSearch;
    @SerializedName("augmented_reality")
    @Expose
    private AugmentedReality augmentedReality;
    @SerializedName("giftcard")
    @Expose
    private Giftcard giftcard;
    @SerializedName("package_xray")
    @Expose
    private PackageXray packageXray;
    @SerializedName("barcode_scanner")
    @Expose
    private BarcodeScanner barcodeScanner;
    @SerializedName("bookstore")
    @Expose
    private Bookstore bookstore;
    @SerializedName("smile_code")
    @Expose
    private SmileCode smileCode;
    @SerializedName("hardlines")
    @Expose
    private Hardlines hardlines;
    @SerializedName("apparelhome")
    @Expose
    private Apparelhome apparelhome;
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

    public ProductSearch getProductSearch() {
        return productSearch;
    }

    public void setProductSearch(ProductSearch productSearch) {
        this.productSearch = productSearch;
    }

    public AugmentedReality getAugmentedReality() {
        return augmentedReality;
    }

    public void setAugmentedReality(AugmentedReality augmentedReality) {
        this.augmentedReality = augmentedReality;
    }

    public Giftcard getGiftcard() {
        return giftcard;
    }

    public void setGiftcard(Giftcard giftcard) {
        this.giftcard = giftcard;
    }

    public PackageXray getPackageXray() {
        return packageXray;
    }

    public void setPackageXray(PackageXray packageXray) {
        this.packageXray = packageXray;
    }

    public BarcodeScanner getBarcodeScanner() {
        return barcodeScanner;
    }

    public void setBarcodeScanner(BarcodeScanner barcodeScanner) {
        this.barcodeScanner = barcodeScanner;
    }

    public Bookstore getBookstore() {
        return bookstore;
    }

    public void setBookstore(Bookstore bookstore) {
        this.bookstore = bookstore;
    }

    public SmileCode getSmileCode() {
        return smileCode;
    }

    public void setSmileCode(SmileCode smileCode) {
        this.smileCode = smileCode;
    }

    public Hardlines getHardlines() {
        return hardlines;
    }

    public void setHardlines(Hardlines hardlines) {
        this.hardlines = hardlines;
    }

    public Apparelhome getApparelhome() {
        return apparelhome;
    }

    public void setApparelhome(Apparelhome apparelhome) {
        this.apparelhome = apparelhome;
    }

    public StringOverrides getStringOverrides() {
        return stringOverrides;
    }

    public void setStringOverrides(StringOverrides stringOverrides) {
        this.stringOverrides = stringOverrides;
    }

}
