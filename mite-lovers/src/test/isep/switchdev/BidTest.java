package isep.switchdev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BidTest {
    @Test
    void construtorInicialized() {
        Bid User = new Bid("Maria");
        double value = 100.50;


        Bid bid = new Bid(User, value);


        assertSame(User, bid.getBidder());
        assertEquals(value, bid.getValue(), 0.001);

    }
}