package isep.switchdev;

import java.lang.module.Configuration;

public class User {

    private String _userName;
    private Contact _contact;
    private String _profile;

    //Constructor
    //Alterar Profile assim que fizer o merge para a main
    public User (String _userName, Contact _contact, String _profile){

        //Considered that the username can't be null
        //nor can it be composed of fewer than 5 digits
        if (_userName == null) {
            throw new IllegalArgumentException("Username não pode ser nulo.");
        }

        //trim() - Java method to remove spaces
        //length() - Java method to count the length of the provided argument
        if (_userName.trim().length() < 5) {
            throw new IllegalArgumentException("Username deve ter pelo menos 5 caracteres.");
        }

        this._userName = _userName;
        this._contact = _contact;
        this._profile = _profile;
    }

    // Getters (não sei se necessário)
    public String getUserName() {
        return _userName;
    }

    public Contact getContact() {
        return _contact;
    }

    public String getProfile() {
        return _profile;
    }

    // Method: full user information
    public String getUserInfo() {
        return "User: " + _userName + ", Contact: " + _contact + ", Profile: " + _profile;
    }

}
