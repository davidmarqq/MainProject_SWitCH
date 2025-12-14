package isep.switchdev;

public class Listing {


    private Item _item;
    private double _price;
    private String _shortDescription;
    private String _listingTitle;
    private SaleType _saleType;
    private User _seller;

    public Listing(Item item, double price, String shortDescription, String listingTitle, SaleType saleType, User seller) {

        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }

        if (listingTitle == null ||  listingTitle.isBlank()) {
            throw new IllegalArgumentException("Listing title cannot be null or blank.");
        }
        if (saleType == null) {
            throw new IllegalArgumentException("Sale type cannot be null.");
        }
        if (seller == null) {
            throw new IllegalArgumentException("User cannot be null.");
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0.");
        }

        this._item = item;
        this._price = price;
        this._shortDescription = shortDescription;
        this._listingTitle = listingTitle;
        this._saleType = saleType;
        this._seller = seller;
    }
}
