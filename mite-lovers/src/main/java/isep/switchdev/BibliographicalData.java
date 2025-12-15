package isep.switchdev;

public class BibliographicalData {
    private Title _title;
    private List<Authors> _authors;
    private Language _language;
    private Publisher _publisher;
    private LocalDate _publicationDate;
    private Genre _genre;
    private int _numberOfPages;
    private String _chuncksOfText;


    public BibliographicalData(Title title, List<Author> authors, Language language, Publisher publisher, LocalDate publicationDate, Genre genre, int numberOfPages, String chuncksOfText) {
        this._title = title;
        this._authors = authors;
        this._language = language;
        this._publisher = publisher;
        this._publicationDate = publicationDate;
        this._genre = genre;
        this._numberOfPages = numberOfPages;
        this._chuncksOfText = chuncksOfText;

    }
}
