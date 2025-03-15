package com.zatca.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Scope {
    @JsonProperty("qr_html")
    private boolean qrHtml;

    @JsonProperty("qr_base64")
    private boolean qrBase64;

    @JsonProperty("qr_svg")
    private boolean qrSvg;

    @JsonProperty("qr_string")
    private boolean qrString;

    @JsonProperty("qr_base64_format")
    private String qrBase64Format;

    @JsonProperty("invoice_pdf")
    private boolean invoicePdf;

    @JsonProperty("invoice_xml")
    private boolean invoiceXml;



    // Getters and setters for all fields

    public boolean isInvoicePdf() {
        return invoicePdf;
    }

    public void setInvoicePdf(boolean invoicePdf) {
        this.invoicePdf = invoicePdf;
    }

    public boolean isInvoiceXml() {
        return invoiceXml;
    }

    public void setInvoiceXml(boolean invoiceXml) {
        this.invoiceXml = invoiceXml;
    }

    public boolean isQrBase64() {
        return qrBase64;
    }

    public void setQrBase64(boolean qrBase64) {
        this.qrBase64 = qrBase64;
    }

    public String getQrBase64Format() {
        return qrBase64Format;
    }

    public void setQrBase64Format(String qrBase64Format) {
        this.qrBase64Format = qrBase64Format;
    }

    public boolean isQrHtml() {
        return qrHtml;
    }

    public void setQrHtml(boolean qrHtml) {
        this.qrHtml = qrHtml;
    }

    public boolean isQrString() {
        return qrString;
    }

    public void setQrString(boolean qrString) {
        this.qrString = qrString;
    }

    public boolean isQrSvg() {
        return qrSvg;
    }

    public void setQrSvg(boolean qrSvg) {
        this.qrSvg = qrSvg;
    }
}
