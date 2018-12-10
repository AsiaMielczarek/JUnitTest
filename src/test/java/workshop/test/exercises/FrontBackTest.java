package workshop.test.exercises;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FrontBackTest {

    @Test
    public void shouldReturnTrue1() {
        assertEquals("eodc", new FrontBack().frontBack("code"));
    }

    @Test
    public void shouldReturnTrue2() {
        assertEquals("a", new FrontBack().frontBack("a"));
    }

    @Test
    public void shouldReturnTrue3() {
        assertEquals("abc", new FrontBack().frontBack("cba"));
    }

    @Test
    public void shouldReturnTrue4() {
        assertEquals("", new FrontBack().frontBack(""));
    }

}

