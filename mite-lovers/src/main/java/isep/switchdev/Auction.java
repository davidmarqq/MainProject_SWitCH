package isep.switchdev;

import java.time.LocalDateTime;
import java.util.List;

public class Auction {

   private String listing;                // change type to Listing when available
   private LocalDateTime initialDate;
   private LocalDateTime finalDate;
   private double initialPrice;
   private double buyOutPrice;
   private List<String> bidHistory;       // Change List Type from String to Bid when Bid is available

   public Auction() {}

   public Auction(String listing, LocalDateTime initialDate, LocalDateTime finalDate, double initialPrice, double buyOutPrice) {
      this.listing = listing;
      this.initialDate = initialDate;
      this.finalDate = finalDate;
      this.initialPrice = initialPrice; // when Listing available, change to listing.getPrice() ... I think the initial price is the
      this.buyOutPrice = buyOutPrice;
   }




}
