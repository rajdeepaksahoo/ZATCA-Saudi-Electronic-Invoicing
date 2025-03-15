package com.zatca.bo;

public class InvoiceGenerationResponse {
    private String status;
    private int code;
    private String message;
    private InvoiceGenerationResponseData data;

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

    public InvoiceGenerationResponseData getData() {
        return data;
    }

    public void setData(InvoiceGenerationResponseData data) {
        this.data = data;
    }
}

