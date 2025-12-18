package isep.switchdev;

import isep.switchdev.Dimensions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DimensionsTest {
    @Test
    public void shouldReturnDimensions() {
        Dimensions dimensions = new Dimensions(10.0, 0.20, 5.2);
        assertEquals(10.0, dimensions.getHeight());
        assertEquals(0.20, dimensions.getWidth());
        assertEquals(5.2, dimensions.getlength());
    }
/*
    public static Stream<org.junit.jupiter.params.provider.Arguments> invalidDimensionsProvider() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(0, 0, 0),
                org.junit.jupiter.params.provider.Arguments.of(1, 0, 0),
                org.junit.jupiter.params.provider.Arguments.of(0, 1, 0),
                org.junit.jupiter.params.provider.Arguments.of(0, 0, 1),
                org.junit.jupiter.params.provider.Arguments.of(-5, 0, 0),
                org.junit.jupiter.params.provider.Arguments.of(1, -2, 0),
                org.junit.jupiter.params.provider.Arguments.of(0, 1, -6),
                org.junit.jupiter.params.provider.Arguments.of(-5, -10, -30)
        );
    }

    @ParameterizedTest
    @MethodSource("invalidDimensionsProvider")
    void allInvalid_ShouldThrowException(Double height, Double width, Double length) {
        assertThrows(IllegalArgumentException.class, () -> {
            new Dimensions(height, width, length);
        });
    }

 */

}