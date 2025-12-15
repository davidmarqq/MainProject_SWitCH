package isep.switchdev;

public class Publisher {

    private String name;
    private String vatNumber;
    private Contact contact;

    public Publisher(String name, String vatNumber, Address address, Contact contact) {
        this.name = name;
        this.vatNumber = vatNumber;
        this.contact = contact;
    }

    // Review what methods we will want in each class

//    public String getName() {
//        return name;
//    }
//
//    public String getVatNumber() {
//        return vatNumber;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public Contact getContact() {
//        return contact;
//    }
}
