package isep.switchdev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BidTest {

    //Test: Constructor&getFullAddress
    @Test
    void constructorShouldCreateBidWhenValid() {
        //Arrange
        Bid User = "Maria";
        double value = 100.50;


        //Act
        Bid result = new Bid(User, value);
        Bid expected = new Bid("Maria", 100.50 );

        //Assert
        assertEquals(result.getBidder(), expected.getValue());
    }


    @Test
    void construtorInicialized() {
        Bid User = new Bid("Maria");
        double value = 100.50;


        Bid bid = new Bid(User, value);


        assertSame(User, bid.getBidder());
        assertEquals(value, bid.getValue(), 0.001);

    }
}