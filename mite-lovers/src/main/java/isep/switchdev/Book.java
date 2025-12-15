package isep.switchdev;

public class Book {

    private Item _item;
    private BibliographicalData _information;
    private Code[2] _isbn;

    public Book(Item item, BibliographicalData information, Code[] isbn){
        this._item = item;
        this._information = information;
        this._isbn = isbn;
    }

    public Item getItem (){ return this._item; }
    public BibligraphicalData getInformation () { return this._information; }
    public Code getCode (){ return this._isbn; }


}
