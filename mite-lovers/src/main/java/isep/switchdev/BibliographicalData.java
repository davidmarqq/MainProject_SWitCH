package isep.switchdev;

import java.time.LocalDate;

public class BibliographicalData {

    // Attributes
    private Title title1;
    private Profile[] authors;
    private Language language;
    private Publisher publisher;
    private LocalDate publishDate;
    private Genre[] genre;
    private int numberOfPages;
    private String chunksOfText;

    // Constructor
    public BibliographicalData(Title title1, Profile[] authors, Language language, Publisher publisher, LocalDate publishDate,
                               Genre[] genre, int numberOfPages, String chunksOfText) {
        this.title1 = title1;
        this.authors = authors;
        this.language = language;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.chunksOfText = chunksOfText;
    }

    // Getters
    public Title getTitle1() {
        return title1;
    }

    public Profile[] getAuthors() {
        return authors;
    }

    public Language getLanguage() {
        return language;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public Genre[] getGenre() {
        return genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getChunksOfText() {
        return chunksOfText;
    }
}
