package isep.switchdev;

import isep.switchdev.Enum.Country;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {

    @Test
    void shouldCreateProfileWithValidData() {
        Profile profile = new Profile(
                "Test User",
                Country.PORTUGAL,
                LocalDate.of(2000, 5, 10),
                true
        );

        assertEquals("Test User", profile.getName());
        assertEquals(Country.PORTUGAL, profile.getCountry());
        assertEquals(LocalDate.of(2000, 5, 10), profile.getBirthday());
        assertTrue(profile.isAuthor());
    }

    @Test
    void shouldFailWhenNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Profile(null, Country.PORTUGAL, LocalDate.now(), false);
        });
    }

    @Test
    void shouldFailWhenNameIsBlank() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Profile("   ", Country.FRANCE, LocalDate.now(), false);
        });
    }

    @Test
    void shouldFailWhenCountryIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Profile("Valid Name", null, LocalDate.now(), false);
        });
    }

    @Test
    void shouldFailWhenBirthdayIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Profile("Valid Name", Country.GERMANY, null, false);
        });
    }
}