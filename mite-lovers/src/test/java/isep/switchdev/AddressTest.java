package isep.switchdev;

import isep.switchdev.Enum.Country;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    @ParameterizedTest
    @NullAndEmptySource
    void constructor_whenCalledWithInvalidStreet_ThrowsException(String street) {
        assertThrows(IllegalArgumentException.class, () -> new Address(street, "dummyNumber", "dummyZipCode", Country.PORTUGAL));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void constructor_whenCalledWithInvalidNumber_ThrowsException(String number) {
        assertThrows(IllegalArgumentException.class, () -> new Address("dummyStreet", number, "dummyZipCode", Country.PORTUGAL));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void constructor_whenCalledWithInvalidZipCode_ThrowsException(String zipCode) {
        assertThrows(IllegalArgumentException.class, () -> new Address("dummyStreet", "dummyNumber", zipCode, Country.PORTUGAL));
    }

    @Test
    void constructor_whenCalledWithInvalidCountry_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Address("dummyStreet", "dummyNumber", "dummyZipCode", null));
    }

    @Test
    void constructor_whenCalledWithValidParameters_DoesNotThrowException() {
        new Address("dummyStreet", "dummyNumber", "dummyZipCode", Country.PORTUGAL);
    }

    @Test
    void getStreet_whenCalled_ReturnsExpectedStreet() {
        String street = "Rua X";

        Address address = new Address(street, "dummyNumber", "dummyZipCode", Country.PORTUGAL);

        assertEquals(street, address.getStreet());
    }

    @Test
    void setStreet_whenCalled_SetsExpectedStreet() {
        String street = "Rua X";

        Address address = new Address("dummyStreet", "dummyNumber", "dummyZipCode", Country.PORTUGAL);
        address.setStreet(street);

        assertEquals(street, address.getStreet());
    }

    @Test
    void getNumber_whenCalled_ReturnsExpectedNumber() {
        String number = "123";

        Address address = new Address("dummyStreet", number, "dummyZipCode", Country.PORTUGAL);

        assertEquals(number, address.getNumber());
    }

    @Test
    void setNumber_whenCalled_SetsExpectedNumber() {
        String number = "123";

        Address address = new Address("dummyStreet", "dummyNumber", "dummyZipCode", Country.PORTUGAL);
        address.setNumber(number);

        assertEquals(number, address.getNumber());
    }

    @Test
    void getZipCode_whenCalled_ReturnsExpectedZipCode() {
        String zipCode = "4795-013";

        Address address = new Address("dummyStreet", "dummyNumber", zipCode, Country.PORTUGAL);

        assertEquals(zipCode, address.getZipCode());
    }

    @Test
    void setZipCode_whenCalled_SetsExpectedZipCode() {
        String zipCode = "4795-013";

        Address address = new Address("dummyStreet", "dummyNumber", "dummyZipCode", Country.PORTUGAL);
        address.setZipCode(zipCode);

        assertEquals(zipCode, address.getZipCode());
    }

    @Test
    void getCountry_whenCalled_ReturnsExpectedCountry() {
        Country country = Country.PORTUGAL;

        Address address = new Address("dummyStreet", "dummyNumber", "dummyZipCode", country);

        assertEquals(country, address.getCountry());
    }

    @Test
    void setCountry_whenCalled_SetsExpectedCountry() {
        Country country = Country.PORTUGAL;

        Address address = new Address("dummyStreet", "dummyNumber", "dummyZipCode", Country.FRANCE);
        address.setCountry(country);

        assertEquals(country, address.getCountry());
    }

    @Test
    void toString_whenCalled_ReturnsExpectedString() {
        Address address = new Address("dummyStreet", "dummyNumber", "dummyZipCode", Country.PORTUGAL);

        assertEquals("dummyStreet, no. dummyNumber, dummyZipCode, PORTUGAL", address.toString());
    }
}
