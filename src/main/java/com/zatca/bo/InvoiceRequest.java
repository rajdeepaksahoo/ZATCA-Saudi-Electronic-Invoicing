package com.zatca.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvoiceRequest {

    @JsonProperty("invoice_id")
    private String invoiceId;

    @JsonProperty("scope")
    private Scope scope;

    // Getters and Setters
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
}
