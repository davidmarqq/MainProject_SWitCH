package isep.switchdev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeTest {

    @Test
    void shouldCreateCodeWithValidData() {

        Code code = new Code(
                "1234567890",
                "9781234567897",
                "2049-3630"
        );

        assertEquals("1234567890", code.getIsbn10());
        assertEquals("9781234567897", code.getIsbn13());
        assertEquals("2049-3630", code.getIssn());
    }

    @Test
    void shouldFailWhenIsbn10IsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Code(null, "9781234567897", "2049-3630");
        });
    }

    @Test
    void shouldFailWhenIsbn13IsBlank() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Code("1234567890", " ", "2049-3630");
        });
    }

    @Test
    void shouldFailWhenIssnIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Code("1234567890", "9781234567897", null);
        });
    }
}
