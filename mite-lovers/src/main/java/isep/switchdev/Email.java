package isep.switchdev;

public class Email {

    private String _userName;
    private String _domain;

    // Constructor
    public Email(String userName, String domain) {

        //trim() - Java method to remove spaces
        //length() - Java method to count the length of the provided argument
        if (userName == null || userName.trim().isEmpty()) {
            throw new IllegalArgumentException("Username can't be null or empty");
        }

        if (domain == null || domain.trim().isEmpty()) {
            throw new IllegalArgumentException("Domain can't be null or empty");
        }

        this._userName = userName;
        this._domain = domain;
    }

    // Getters (não sei se necessário)
    public String getUserName() {
        return _userName;
    }

    public String getDomain() {
        return _domain;
    }

    // Method: Retorn full email
    public String getFullEmail() {
        return _userName + "@" + _domain;
    }

}
