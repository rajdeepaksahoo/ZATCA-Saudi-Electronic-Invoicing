package com.zatca.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvoiceGenerationResponseData {
    @JsonProperty("id")
    private int id;

    @JsonProperty("invoice_id")
    private int invoiceId;

    @JsonProperty("qr_base64")
    private String qrBase64;

    @JsonProperty("qr_svg")
    private String qrSvg;

    @JsonProperty("qr_jpg")
    private String qrJpg;

    @JsonProperty("invoice_pdf")
    private String invoicePdf;

    @JsonProperty("invoice_xml")
    private String invoiceXml;

    @JsonProperty("qr_string")
    private String qrString;
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getQrBase64() {
        return qrBase64;
    }

    public void setQrBase64(String qrBase64) {
        this.qrBase64 = qrBase64;
    }

    public String getQrSvg() {
        return qrSvg;
    }

    public void setQrSvg(String qrSvg) {
        this.qrSvg = qrSvg;
    }

    public String getQrJpg() {
        return qrJpg;
    }

    public void setQrJpg(String qrJpg) {
        this.qrJpg = qrJpg;
    }

    public String getInvoicePdf() {
        return invoicePdf;
    }

    public void setInvoicePdf(String invoicePdf) {
        this.invoicePdf = invoicePdf;
    }

    public String getInvoiceXml() {
        return invoiceXml;
    }

    public void setInvoiceXml(String invoiceXml) {
        this.invoiceXml = invoiceXml;
    }

    public String getQrString() {
        return qrString;
    }

    public void setQrString(String qrString) {
        this.qrString = qrString;
    }
}
