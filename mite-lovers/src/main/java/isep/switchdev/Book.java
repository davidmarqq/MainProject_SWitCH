package isep.switchdev;

public class Book {
    private Item _item;
    private String _isbn;   // TODO change to Code
    private BibliographicalData _information;

    public Book(Item _item, String isbn, BibliographicalData information) {
        this._item = _item;
        this._isbn = isbn;
        this._information = information;
    }
}

