package isep.switchdev;

import isep.switchdev.Enum.Country;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublisherTest {

    // Where should we be testing our classes?
    @Test
    void constructorShouldCreatePublisherWhenDataIsValid() {

        // Arrange
        String name = "Asas";
        String vatNumber = "123456";
        Address address = new Address("Rua Doutor David Paixão", "55", "333-332",
                Country.PORTUGAL);
        Email email = new Email("cool", "@mail.com");
        Contact contact = new Contact("91440055", "+351", email, address);

        //Act
        Publisher result = new Publisher(name, vatNumber, address, contact);

    }
}