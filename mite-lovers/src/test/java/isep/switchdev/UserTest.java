package isep.switchdev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    //Test: Construtor&getUserInfo
    @Test
    void getUserInfoShouldReturnFormattedString() {

        // ---------- ARRANGE ----------
        Contact contact = new Contact("123456789", "00351", null, null);
        User user = new User("DavidMarques", contact, "Admin");

        String expected = "User: DavidMarques" + ", Contact: " + contact + ", Profile: Admin";

        // ---------- ACT ----------
        String result = user.getUserInfo();

        // ---------- ASSERT ----------
        assertEquals(expected, result);
    }



}