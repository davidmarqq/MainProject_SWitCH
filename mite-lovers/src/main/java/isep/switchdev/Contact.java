package isep.switchdev;

public class Contact {

    private String _phoneNum;
    private String _extension;
    private Email _email;
    private Address _address;

    // Constructor
    public Contact(String phoneNum, String extension, Email email, Address address) {

        if (extension == null) {
            throw new IllegalArgumentException("Extension can´t be null");
        }

        this._phoneNum = phoneNum;
        this._extension = extension;
        this._email = email;
        this._address = address;
    }

    // Getters (não sei se necessário)
    public String getPhoneNum() {
        return phoneNum;
    }

    public String getExtension() {
        return extension;
    }

    public Email getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    //Method: Get full phone number (extension + number)
    public String getFullPhone() {

        if (extension == null) {
            throw new IllegalArgumentException("Extension can´t be null");
        }

        return extension + " " + phoneNum;
    }

    //Method: Get full contact information
    public String getFullContactInfo () {

        return "Full Contact - " +
                "Phone number: " + extension + " " + phoneNum +
                ", e-mail: " + email +
                ", address: " + address +
                "}";
    }


}
