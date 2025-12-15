package isep.switchdev;

import java.time.LocalDate;

public class BibliographicalData {
    private Title _title;
    private String _authors;   //TODO change to List<Authors>
    private String _language;     //TODO Language
    private String _publisher;  //TODO publisher
    private LocalDate _publicationDate;
    private String _genre;   //TODO Genre
    private int _numberOfPages;
    private String _chuncksOfText;


    public BibliographicalData(Title title, String authors, String language, String publisher, LocalDate publicationDate, String genre, int numberOfPages, String chuncksOfText) {
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
