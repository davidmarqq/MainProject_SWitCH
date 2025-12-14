package isep.switchdev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BidTest {
    @Test
    void construtorInicialized() {
        User Bid = new Bid ("Maria", 20);

        assertEquals("Maria", Bid.getBidder());
        assertEquals(20, Bid.getvalue());

    }
}