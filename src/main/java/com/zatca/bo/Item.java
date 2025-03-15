package com.zatca.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
    @JsonProperty("item_id")
    private int itemId;

    @JsonProperty("name_english")
    private String nameEnglish;

    @JsonProperty("description_english")
    private String descriptionEnglish;

    @JsonProperty("name_arabic")
    private String nameArabic;

    @JsonProperty("description_arabic")
    private String descriptionArabic;

    @JsonProperty("unit_of_measurement")
    private String unitOfMeasurement;

    @JsonProperty("unit_price")
    private double unitPrice;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("discount_amount")
    private double discountAmount;

    @JsonProperty("taxable_amount")
    private double taxableAmount;

    @JsonProperty("rate_of_tax")
    private double rateOfTax;

    @JsonProperty("tax_amount")
    private double taxAmount;

    @JsonProperty("tax_mode")
    private String taxMode;

    @JsonProperty("sub_total")
    private double subTotal;

    @JsonProperty("additional_data")
    private Object additionalData;

    public Object getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(Object additionalData) {
        this.additionalData = additionalData;
    }

    public String getDescriptionArabic() {
        return descriptionArabic;
    }

    public void setDescriptionArabic(String descriptionArabic) {
        this.descriptionArabic = descriptionArabic;
    }

    public String getDescriptionEnglish() {
        return descriptionEnglish;
    }

    public void setDescriptionEnglish(String descriptionEnglish) {
        this.descriptionEnglish = descriptionEnglish;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getNameArabic() {
        return nameArabic;
    }

    public void setNameArabic(String nameArabic) {
        this.nameArabic = nameArabic;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }

    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getRateOfTax() {
        return rateOfTax;
    }

    public void setRateOfTax(double rateOfTax) {
        this.rateOfTax = rateOfTax;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTaxableAmount() {
        return taxableAmount;
    }

    public void setTaxableAmount(double taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getTaxMode() {
        return taxMode;
    }

    public void setTaxMode(String taxMode) {
        this.taxMode = taxMode;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Getters and setters for all fields
}
