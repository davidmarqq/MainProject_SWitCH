package isep.switchdev;

import isep.switchdev.Enum.Country;

public class Address {

    private String street;
    private String number;
    private String zipCode;
    private Country country;


    public Address(String street, String number, String zipCode, Country country) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.country = country;

    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Country getCountry() {
        return country;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return street + ", no." + number + ", " + zipCode + ", " + country;
    }
}
