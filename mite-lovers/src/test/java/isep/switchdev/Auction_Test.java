import isep.switchdev.Auction;
import org.junit.jupiter.api.Test;


import java.time.LocalDateTime;
import java.util.List;

class Auction_Test {

    @Test
    public void testEmptyConstructor() {
        Auction auction = new Auction();
    }

    @Test
    public void testAllArgumentsConstructor() {

        String listing = "new listing";
        LocalDateTime initialDate = LocalDateTime.now();
        LocalDateTime finalDate = LocalDateTime.of(2025, 12, 31, 23, 0, 0);

        Auction auction = new Auction(listing, initialDate, finalDate, 35.50, 150 );
    }

}