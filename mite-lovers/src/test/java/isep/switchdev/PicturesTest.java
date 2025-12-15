package isep.switchdev;

import isep.switchdev.Pictures;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PicturesTest {

    private static final String validUrl = "urlxpto";
    private static final String validDescription = "picture1";

    @Test
    public void getPictures_HappyPath() {
        Pictures pictures = new Pictures(validUrl, validDescription);
        assertEquals("[" + validDescription + "] " + validUrl, pictures.getPictures());
    }

    // Provide invalid combinations
    public static Stream<Arguments> invalidProvider() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of(null, validDescription),
                Arguments.of(validUrl, null),
                Arguments.of("", ""),
                Arguments.of("", validDescription),
                Arguments.of(validUrl, ""),
                Arguments.of("  ", "  "),
                Arguments.of("  ", validDescription),
                Arguments.of(validUrl, "  ")
        );
    }

    @ParameterizedTest
    @MethodSource("invalidProvider")
    void allInvalid_ShouldThrowException(String url, String description) {
        assertThrows(IllegalArgumentException.class, () -> {
            new Pictures(url, description);
        });
    }
}
