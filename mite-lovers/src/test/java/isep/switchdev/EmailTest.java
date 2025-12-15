package isep.switchdev;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    //Test Contrutor&getFullEmail
    //Successful case
    @Test
    void constructorShouldCreateEmailWhenDataIsValid() {

        // ---------- ARRANGE ----------
        String userName = "david";
        String domain = "gmail.com";

        Email expected = new Email(userName, domain);

        // ---------- ACT ----------
        Email result = new Email("david", "gmail.com");

        // ---------- ASSERT ----------
        assertEquals(expected.getFullEmail(), result.getFullEmail());
    }

    //userName: null
    @Test
    void constructorShouldThrowExceptionWhenUserNameIsNull() {

        // ---------- ARRANGE ----------
        String userName = null;
        String domain = "gmail.com";

        // ---------- ACT ----------
        Executable action = () -> new Email(userName, domain);

        // ---------- ASSERT ----------
        assertThrows(IllegalArgumentException.class, action);
    }


    //userName: empty
    @Test
    void constructorShouldThrowExceptionWhenUserNameIsEmpty() {

        // ---------- ARRANGE ----------
        String userName = "   ";   // vazio, apenas espaços
        String domain = "gmail.com";

        // ---------- ACT ----------
        Executable action = () -> new Email(userName, domain);

        // ---------- ASSERT ----------
        assertThrows(IllegalArgumentException.class, action);
    }


    //Domail: null
    @Test
    void constructorShouldThrowExceptionWhenDomainIsNull() {

        // ---------- ARRANGE ----------
        String userName = "john";
        String domain = null;

        // ---------- ACT ----------
        Executable action = () -> new Email(userName, domain);

        // ---------- ASSERT ----------
        assertThrows(IllegalArgumentException.class, action);
    }


    //Domain: Empty
    @Test
    void constructorShouldThrowExceptionWhenDomainIsEmpty() {

        // ---------- ARRANGE ----------
        String userName = "john";
        String domain = "   ";

        // ---------- ACT ----------
        Executable action = () -> new Email(userName, domain);

        // ---------- ASSERT ----------
        assertThrows(IllegalArgumentException.class, action);
    }

}