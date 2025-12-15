package isep.switchdev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    //Test: Constructor&getFullAddress
    @Test
    void constructorShouldCreateAddressWhenDataIsValid() {
        //Arrange
        String street = "Main Street";
        String number = "10";
        String zipCode = "4000-123";
        String country = "Portugal";

        //Act
        Address result = new Address(street, number, zipCode, country);
        Address expected = new Address("Main Street", "10", "4000-123", "Portugal");

        //Assert
        assertEquals(result.getFullAddress(), expected.getFullAddress());
    }

    //Error Cases
    //Street: null
    @Test
    void constructorShouldThrowExceptionWhenStreetIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Address(null, "10", "4000-123", "Portugal");
        });
    }

    //Street: empty
    @Test
    void constructorShouldThrowExceptionWhenStreetIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Address("   ", "10", "4000-123", "Portugal");
        });
    }

    //Number: null
    @Test
    void constructorShouldThrowExceptionWhenNumberIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Address("Main St", null, "4000-123", "Portugal");
        });
    }

    //Number: empty
    @Test
    void constructorShouldThrowExceptionWhenNumberIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Address("Main St", "   ", "4000-123", "Portugal");
        });
    }

    //zipCode: null
    @Test
    void constructorShouldThrowExceptionWhenZipCodeIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Address("Main St", "10", null, "Portugal");
        });
    }

    //zipCode: empty
    @Test
    void constructorShouldThrowExceptionWhenZipCodeIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Address("Main St", "10", "   ", "Portugal");
        });
    }

    //Country: null
    @Test
    void constructorShouldThrowExceptionWhenCountryIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Address("Main St", "10", "4000-123", null);
        });
    }
}