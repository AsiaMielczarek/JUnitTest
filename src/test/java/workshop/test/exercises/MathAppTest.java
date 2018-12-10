package workshop.test.exercises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import workshop.test.exercises.services.MathService;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathAppTest {

    @Mock
    MathService mathService;

    @InjectMocks
    MathApp mathApp = new MathApp();

    @Test
    public void multiply() {
        // wyświetla metodę z MathService
        when(mathService.multiply(10, 5)).thenReturn(50);
        // wyświetla metodę z MathApp
        assertEquals(60, mathApp.multiply(10, 5));
    }
}