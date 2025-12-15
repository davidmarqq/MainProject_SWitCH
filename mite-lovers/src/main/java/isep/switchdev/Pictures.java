package isep.switchdev;

public class Pictures {
    private final String _url;
    private final String _description;

    public Pictures(String url, String description) {
        if (Validator.isNullOrBlank(url, description)) {
            throw new IllegalArgumentException("URL and Description cannot be empty");
        }

        this._url = url;
        this._description = description;
    }

    public String getPictures() {
        return "[" + _description + "] " + _url;
    }
}