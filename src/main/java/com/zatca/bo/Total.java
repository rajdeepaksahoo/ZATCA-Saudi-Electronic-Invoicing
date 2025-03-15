package com.zatca.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Total {
    @JsonProperty("sub_total")
    private double subTotal;

    @JsonProperty("taxable_total")
    private double taxableTotal;

    @JsonProperty("vat_total")
    private double vatTotal;

    @JsonProperty("net_amount")
    private double netAmount;

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTaxableTotal() {
        return taxableTotal;
    }

    public void setTaxableTotal(double taxableTotal) {
        this.taxableTotal = taxableTotal;
    }

    public double getVatTotal() {
        return vatTotal;
    }

    public void setVatTotal(double vatTotal) {
        this.vatTotal = vatTotal;
    }

    // Getters and setters for all fields
}