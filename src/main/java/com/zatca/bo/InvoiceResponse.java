package com.zatca.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvoiceResponse {

    @JsonProperty("status")
    private String status;

    @JsonProperty("code")
    private int code;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private InvoiceResponseData data;

    // Getters and Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public InvoiceResponseData getData() {
        return data;
    }

    public void setData(InvoiceResponseData data) {
        this.data = data;
    }
}

