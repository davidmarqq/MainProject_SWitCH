package isep.switchdev;

import isep.switchdev.Enum.Country;
import isep.switchdev.Enum.Genre;
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
        Profile[] authors = { new Profile("John", Country.FRANCE, LocalDate.of(2000,5,10), false) };
        Locale language = Locale.ENGLISH;                               // substitui Language (que seria um enum) por Locale
        Publisher publisher = new Publisher("Porto Editora", "23456789", new Address("rua x", "23", "3456-123", Country.PORTUGAL), new Contact("12345674", "+351", new Email("username", "@exemplo.com"), new Address("rua x", "23", "3456-123", Country.PORTUGAL)));
        LocalDate publishDate = LocalDate.of(2021, 1, 1);
        Genre[] genres = new Genre[]{Genre.FICTION};
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
        Profile[] authors = { new Profile("John", Country.FRANCE, LocalDate.of(2000,5,10), false)};
        Locale language = Locale.ENGLISH;                        // substitui Language (que seria um enum) por Locale
        Publisher publisher = new Publisher("Porto Editora", "23456789", new Address("rua x", "23", "3456-123", Country.PORTUGAL), new Contact("12345674", "+351", new Email("username", "@exemplo.com"), new Address("rua x", "23", "3456-123", Country.PORTUGAL)));
        LocalDate publishDate = LocalDate.of(2022, 8, 4);
        Genre[] genres = new Genre[]{Genre.NONFICTION, Genre.BIBLIOGRAPHICAL, Genre.ADVENTURE};
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