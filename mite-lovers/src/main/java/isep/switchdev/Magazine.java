package isep.switchdev;

public class Magazine {
    private Item _item;
    private String _issn;  // TODO change to Code
    private BibliographicalData _information;

    public Magazine(Item _item, String issn, BibliographicalData information) {
        this._item = _item;
        this._issn = issn;
        this._information = information;
    }
}
