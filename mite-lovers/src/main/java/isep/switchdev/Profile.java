package isep.switchdev.profile;

import isep.switchdev.Enum.Country;

import java.time.LocalDate;

public class Profile {

    private final String name;
    private final Country country;
    private final LocalDate birthday;
    private final boolean isAuthor;

    public Profile(String name, Country country, LocalDate birthday, boolean isAuthor) {
        if (name == null || name.isBlank() || country == null || birthday == null) {
            throw new IllegalArgumentException("Profile attributes cannot be null or empty");
        }
        this.name = name;
        this.country = country;
        this.birthday = birthday;
        this.isAuthor = isAuthor;
    }
    public String getName() {
        return name;
    }
    public Country getCountry() {
        return country;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public boolean isAuthor() {
        return isAuthor;
    }
}
