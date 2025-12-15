package isep.switchdev;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BibliographicalDataTest {

    // Test with only one author and one genre
    @Test
    void testConstructorInitializedOneAuthorAndOneGenre() {

        // Arrange
        Title title = new Title("Childhood, Youth, Dependency: The Copenhagen Trilogy");
        Profile[] authors = { new Profile("Tove Ditlevsen") };
        Locale language = Locale.ENGLISH;                               // substitui Language (que seria um enum) por Locale
        Publisher publisher = new Publisher("Penguin Books LTD");
        LocalDate publishDate = LocalDate.of(2021, 1, 1);
        Genre[] genres = new Genre("Fiction");
        int numberOfPages = 370;
        String chunksOfText = "And I want so badly to own my own time instead of always having to sell it.";

        // Act
        BibliographicalData data = new BibliographicalData(title, authors, language, publisher,
                publishDate, genres, numberOfPages, chunksOfText);

        // Assert
        assertEquals(title, data.getTitle1());
        assertArrayEquals(authors, data.getAuthors());
        assertEquals(language, data.getLanguage());
        assertEquals(publisher, data.getPublisher());
        assertEquals(publishDate, data.getPublishDate());
        assertArrayEquals(genres, data.getGenre());
        assertEquals(numberOfPages, data.getNumberOfPages());
        assertEquals(chunksOfText, data.getChunksOfText());
    }

    // Test with more than one author and genre
    @Test
    void testConstructorInitializedMoreThanOneAuthorAndGenre() {

        // Arrange
        Title title = new Title("The Age of AI: And Our Human Future");
        Profile[] authors = { new Profile("Henry A Kissinger" + "Eric Schmidt III" + "Daniel Huttenlocher") };
        Locale language = Locale.ENGLISH;                        // substitui Language (que seria um enum) por Locale
        Publisher publisher = new Publisher("John Murray Press");
        LocalDate publishDate = LocalDate.of(2022, 8, 4);
        Genre[] genres = new Genre("Nonfiction" + "Technology" + "Science" + "Business" + "Social Sciences" + "Philosophy");
        int numberOfPages = 272;
        String chunksOfText = " ";

        // Act
        BibliographicalData data = new BibliographicalData(title, authors, language, publisher,
                publishDate, genres, numberOfPages, chunksOfText);

        // Assert
        assertEquals(title, data.getTitle1());
        assertArrayEquals(authors, data.getAuthors());
        assertEquals(language, data.getLanguage());
        assertEquals(publisher, data.getPublisher());
        assertEquals(publishDate, data.getPublishDate());
        assertArrayEquals(genres, data.getGenre());
        assertEquals(numberOfPages, data.getNumberOfPages());
        assertEquals(chunksOfText, data.getChunksOfText());
    }
}