package isep.switchdev;

public class Magazine {
    private Item _item;
    private Code _issn;
    private BibliographicalData _information;

    public Magazine(Item _item, Code issn, BibliographicalData information) {
        this._item = _item;
        this._issn = issn;
        this._information = information;
    }
}
