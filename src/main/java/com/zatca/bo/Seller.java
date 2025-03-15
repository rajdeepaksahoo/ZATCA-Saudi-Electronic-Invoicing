package com.zatca.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Seller {
    @JsonProperty("name")
    private String name;

    @JsonProperty("building_number")
    private String buildingNumber;

    @JsonProperty("street_name_1")
    private String streetName1;

    @JsonProperty("street_name_2")
    private String streetName2;

    @JsonProperty("district")
    private String district;

    @JsonProperty("city")
    private String city;

    @JsonProperty("country")
    private String country;

    @JsonProperty("postal_code")
    private String postalCode;

    @JsonProperty("vat_number")
    private String vatNumber;

    @JsonProperty("additional_number")
    private String additionalNumber;

    @JsonProperty("other_id")
    private String otherId;

    public String getAdditionalNumber() {
        return additionalNumber;
    }

    public void setAdditionalNumber(String additionalNumber) {
        this.additionalNumber = additionalNumber;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherId() {
        return otherId;
    }

    public void setOtherId(String otherId) {
        this.otherId = otherId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetName1() {
        return streetName1;
    }

    public void setStreetName1(String streetName1) {
        this.streetName1 = streetName1;
    }

    public String getStreetName2() {
        return streetName2;
    }

    public void setStreetName2(String streetName2) {
        this.streetName2 = streetName2;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }
}
