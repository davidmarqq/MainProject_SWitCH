package isep.switchdev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private User buyer;
    private Cart cart;
    private Listing listing1;
    private Listing listing2;

    void setUp() {
        buyer = new User();
        cart = new Cart(user);
        listing1 = new Listing();
        listing2 = new Listing();
    }

    // Cart tem 1 Buyer
    @Test
    void cartShouldBeCreatedWithBuyer() {
        assertEquals(user, cart.getBuyer());
    }

    // Cart deve iniciar vazio
    @Test
    void cartShouldStartEmpty() {
        assertTrue(cart.getItemsList().isEmpty());
    }

    // Cart deve iniciar sem transaction
    @Test
    void cartShouldStartWithNoTransaction() {
        assertNull(cart.getTransaction());
    }
}