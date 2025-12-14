package isep.switchdev;

public class Bid {
    private User bidder;
    private double value;

    public Bid (User bidder, double value) {
        this.bidder = bidder;
        this.value = value;

    }

    public User getBidder(){
        return bidder;
    }

    public double getValue(){
        return value;
    }
}
