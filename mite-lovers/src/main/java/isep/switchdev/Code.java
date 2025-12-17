package isep.switchdev;

public class Code {
    private final String isbn10;
    private final String isbn13;
    private final String issn;

    public Code(String isbn10, String isbn13, String issn) {
        if (isbn10 == null || isbn10.isBlank() || isbn13 == null || isbn13.isBlank() || issn == null || issn.isBlank()) {
            throw new IllegalArgumentException("Code attributes cannot be null or blank");
        }

        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
        this.issn = issn;
    }
    public String getIsbn10() {
        return isbn10;
    }
    public String getIsbn13() {
        return isbn13;
    }
    public String getIssn() {
        return issn;
    }
}
