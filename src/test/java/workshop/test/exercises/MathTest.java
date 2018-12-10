package workshop.test.exercises;

import org.junit.Test;
import workshop.test.exercises.services.MathService;

import static org.junit.Assert.assertEquals;

public class MathTest {

    @Test
    public void shouldMultiply() {
        // Given
        MathService mathService = new MathService();
        int a = 2, b = 4;
        int expectedOutput = 8;

        // When
        int actualOutput = mathService.multiply(a,b);

        // Then
        assertEquals(expectedOutput, actualOutput);
        assertEquals(6, mathService.multiply(2,3));
        assertEquals(6, mathService.multiply(2,8));
        // sukces, jeśli nie przechodzi
        // fail("Failed.");
    }

}