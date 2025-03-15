package com.zatca.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InvoiceData {
    @JsonProperty("origin")
    private String origin;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("invoice_number")
    private String invoiceNumber;

    @JsonProperty("invoice_date")
    private String invoiceDate;

    @JsonProperty("supply_date")
    private String supplyDate;

    @JsonProperty("invoice_type")
    private String invoiceType;

    @JsonProperty("document_reference")
    private String documentReference;

    @JsonProperty("advance_invoice_uuid")
    private String advanceInvoiceUuid;

    @JsonProperty("business_type")
    private String businessType;

    @JsonProperty("time_stamp")
    private String timeStamp;

    @JsonProperty("operator_name")
    private String operatorName;

    @JsonProperty("invoice_id")
    private int invoiceId;

    @JsonProperty("seller_id")
    private int sellerId;

    @JsonProperty("buyer_id")
    private int buyerId;

    @JsonProperty("seller_english")
    private Seller sellerEnglish;

    @JsonProperty("seller_arabic")
    private Seller sellerArabic;

    @JsonProperty("buyer_english")
    private Seller buyerEnglish;

    @JsonProperty("buyer_arabic")
    private Seller buyerArabic;

    @JsonProperty("items")
    private List<Item> items;

    @JsonProperty("total")
    private Total total;

    @JsonProperty("additional_data")
    private Object additionalData;

    @JsonProperty("scope")
    private Scope scope;

    public Object getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(Object additionalData) {
        this.additionalData = additionalData;
    }

    public String getAdvanceInvoiceUuid() {
        return advanceInvoiceUuid;
    }

    public void setAdvanceInvoiceUuid(String advanceInvoiceUuid) {
        this.advanceInvoiceUuid = advanceInvoiceUuid;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Seller getBuyerArabic() {
        return buyerArabic;
    }

    public void setBuyerArabic(Seller buyerArabic) {
        this.buyerArabic = buyerArabic;
    }

    public Seller getBuyerEnglish() {
        return buyerEnglish;
    }

    public void setBuyerEnglish(Seller buyerEnglish) {
        this.buyerEnglish = buyerEnglish;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public String getDocumentReference() {
        return documentReference;
    }

    public void setDocumentReference(String documentReference) {
        this.documentReference = documentReference;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Seller getSellerArabic() {
        return sellerArabic;
    }

    public void setSellerArabic(Seller sellerArabic) {
        this.sellerArabic = sellerArabic;
    }

    public Seller getSellerEnglish() {
        return sellerEnglish;
    }

    public void setSellerEnglish(Seller sellerEnglish) {
        this.sellerEnglish = sellerEnglish;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(String supplyDate) {
        this.supplyDate = supplyDate;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
