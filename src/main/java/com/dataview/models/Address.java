package com.dataview.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class Address {

    @Column(name = "street", nullable = false, length = 100)
    @Size(min = 3, max = 100)
    @NotBlank
    private String street;

    @Column(name = "number", nullable = false, length = 10)
    @Size(min = 1, max = 10)
    @NotBlank
    private String number;

    @Column(name = "city", nullable = false, length = 50)
    @Size(min = 2, max = 50)
    @NotBlank
    private String city;

    @Column(name = "state", nullable = false, length = 50)
    @Size(min = 2, max = 50)
    @NotBlank
    private String state;

    @Column(name = "latitude", precision = 10, scale = 8)
    private BigDecimal latitude;

    @Column(name = "longitude", precision = 11, scale = 8)
    private BigDecimal longitude;

    // Constructors
    public Address() {}

    public Address(String street, String number, String city, String state, BigDecimal latitude, BigDecimal longitude) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters and Setters

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
