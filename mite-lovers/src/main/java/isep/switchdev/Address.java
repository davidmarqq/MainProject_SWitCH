package isep.switchdev;

public class Address {

    private String _street;
    private String _number;
    private String _zipCode;
    private String _country;

    //Constructor
    //Alterar Country assim que fizer o merge para a main
    public Address(String street, String number, String zipCode, String country) {

        //trim() - Java method to remove spaces
        //length() - Java method to count the length of the provided argument
        if (street == null || street.trim().isEmpty()) {
            throw new IllegalArgumentException("Street can't be null or empty.");
        }

        if (number == null || number.trim().isEmpty()) {
            throw new IllegalArgumentException("Number can't be null or empty.");
        }

        if (zipCode == null || zipCode.trim().isEmpty()) {
            throw new IllegalArgumentException("ZipCode can't be null or empty.");
        }

        if (country == null) {
            throw new IllegalArgumentException("Country can't be null");
        }

        this._street = street;
        this._number = number;
        this._zipCode = zipCode;
        this._country = country;
    }

    public String getStreet() {
        return _street;
    }

    public String getNumber() {
        return _number;
    }

    public String getZipCode() {
        return _zipCode;
    }

    public String getCountry() {
        return _country;
    }

    //Method: Return full address
    public String getFullAddress() {
        return _street + ", " + _number + " (" + _zipCode + "), " + _country;
    }
}
