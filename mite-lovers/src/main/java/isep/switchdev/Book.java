package isep.switchdev;

public class Book {
    private Item _item;
    private Code _isbn;
    private BibliographicalData _information;

    public Book(Item _item, Code isbn, BibliographicalData information) {
        this._item = _item;
        this._isbn = isbn;
        this._information = information;
    }
}

