package isep.switchdev;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Listing> itemsList;
    private User buyer;
    private Transaction transaction;

    public Cart(User buyer) {
        this.itemsList = new ArrayList<>();
        this.buyer = buyer;
        this.transaction = null;
    }

    public void addItem(Listing listing) {
        itemsList.add(listing);
    }

    public void removeItem(Listing listing) {
        itemsList.remove(listing);
    }

    public List<Listing> getItemsList() {
        return itemsList;
    }

    public User getBuyer() {
        return buyer;
    }

    public Transaction getTransaction() {
        return transaction;
    }
}