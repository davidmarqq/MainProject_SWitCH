package isep.switchdev;

public class Title {
    String _title;

    public Title(String title) {
        if (Validator.isNullOrBlank(title)) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this._title = title;
    }
}
