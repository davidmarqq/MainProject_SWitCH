package isep.switchdev;

public class Bid {
    private User bidder;
    private double value;
    // private Auction auction;  // Referência ao leilão


    public Bid (User bidder, double value) {


        //Considered that the bidder can't be null
        if (bidder == null) {
            throw new IllegalArgumentException("bidder can't be null.");
        }

        // Value cannot be negative
        if (value <= 0) {
            throw new IllegalArgumentException("Bid value must be positive.");
        }

        this.bidder = bidder;
        this.value = value;
        // this.auction = auction;


    }

    public User getBidder(){
        return bidder;
    }

    public double getValue(){
        return value;
    }

    //  public Auction getAuction() {
    //        return auction;
    //    }

    public String getBidInfo() {
        return "Bidder: " + bidder.getUserName() + ", Value: " + value;
    }



    //Do I put a conncetion to Auction??

}
