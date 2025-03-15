package com.zatca.bo;

public class ZetcaTokenResponse {
    private String status;
    private Integer code;
    private String message;
    private ZatcaTokenResponseData data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ZatcaTokenResponseData getData() {
        return data;
    }

    public void setData(ZatcaTokenResponseData data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
