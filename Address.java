package com.company;

public class Address {
    private String country;
    private String region;
    private String locality;
    private String area;
    private String street;
    private int house;
    private int apartment;

    public Address(String country, String region, String locality, String area, String street, int house, int apartment) {
        this.country = country;
        this.region = region;
        this.locality = locality;
        this.area = area;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }
    public Address() {
        this.country ="";
        this.region = "";
        this.locality = "";
        this.area = "";
        this.street = "";
        this.house = 0;
        this.apartment = 0;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return country +","+ region + " region," + locality + "," + area + "," + street + "," + house + ","+ apartment;
    }
}
