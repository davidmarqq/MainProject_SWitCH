package isep.switchdev;

public class Listing {


    private Item item;
    private double price;
    private String shortDescription;
    private String listingTitle;
    private SaleType saleType;
    private User seller;

    public Listing(Item item, double price, String shortDescription, String listingTitle, SaleType saleType, User seller) {
        this.item = item;
        this.price = price;
        this.shortDescription = shortDescription;
        this.listingTitle = listingTitle;
        this.saleType = saleType;
        this.seller = seller;
    }

}
