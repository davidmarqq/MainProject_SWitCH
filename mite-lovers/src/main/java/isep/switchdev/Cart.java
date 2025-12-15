package isep.switchdev;

public class Cart {
private List<Listing> _itemsList;
private User _buyer;
}

public Cart ( List<Listing> itemsList, User buyer){
    this._itemsList = itemsList;
    this._buyer = buyer;
}