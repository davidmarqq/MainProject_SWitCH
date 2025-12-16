package isep.switchdev;

import isep.switchdev.Enum.Country;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {

    @Test
    void createProfileWithValidData() {
        Profile profile = new Profile(
                "Bruno",
                Country.PORTUGAL,
                LocalDate.of(1999, 1, 1),
                true
        );

        assertEquals("Bruno", profile.getName());
        assertEquals(Country.PORTUGAL, profile.getCountry());
        assertEquals(LocalDate.of(1999, 1, 1), profile.getBirthday());
        assertTrue(profile.isAuthor());
    }

    @Test
    void nameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Profile(null, Country.PORTUGAL, LocalDate.now(), true)
        );
    }

    @Test
    void nameCannotBeBlank() {
        assertThrows(IllegalArgumentException.class, () ->
                new Profile("   ", Country.PORTUGAL, LocalDate.now(), true)
        );
    }

    @Test
    void countryCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Profile("Bruno", null, LocalDate.now(), true)
        );
    }

    @Test
    void birthdayCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () ->
                new Profile("Bruno", Country.PORTUGAL, null, true)
        );
    }
}