package isep.switchdev;

import isep.switchdev.Enum.Country;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    //Test: Contructor&getFullContactInfo
    //Successful case
    @Test
    void constructorShouldCreateContactWhenDataIsValid() {

        // Arrange
        String phone = "123456789";
        String extension = "00351";
        Email email = new Email("user", "example.com");
        Address address = new Address("Main St", "10", "4000-123", Country.PORTUGAL);

        Contact expected = new Contact(phone, extension, email, address);

        // Act
        Contact result = new Contact(phone, extension, email, address);

        // Assert
        assertEquals(expected.getFullContactInfo(), result.getFullContactInfo());
    }

    //Error case
    @Test
    void constructorShouldThrowExceptionWhenExtensionIsNull() {

        // Arrange
        String phone = "123456789";
        String extension = null;
        Email email = new Email("user", "example.com");
        Address address = new Address("Main St", "10", "4000-123", Country.PORTUGAL);

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () ->
                new Contact(phone, extension, email, address)
        );
    }

    //Method: getFullPhoneNumber
    //Successful case
    @Test
    void getFullPhoneShouldReturnFormattedNumber() {

        // Arrange
        String phone = "123456789";
        String extension = "00351";
        Contact contact = new Contact(phone, extension, null, null);

        String expected = "00351 123456789";

        // Act
        String result = contact.getFullPhone();

        // Assert
        assertEquals(expected, result);
    }

    //Method: getFullContactInfo
    @Test
    void getFullContactInfoShouldReturnFormattedString() {

        // Arrange
        Email email = new Email("user", "example.com");
        Address address = new Address("Main St", "10", "4000-123", Country.PORTUGAL);
        Contact contact = new Contact("123456789", "00351", email, address);

        String expected =
                "Full Contact - " + "Phone number: 00351 123456789" + ", e-mail: " + email + ", address: " + address;

        // Act
        String result = contact.getFullContactInfo();

        // Assert
        assertEquals(expected, result);
    }

}