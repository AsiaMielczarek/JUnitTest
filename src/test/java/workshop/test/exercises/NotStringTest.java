package workshop.test.exercises;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotStringTest {

    static NotString ns;
    @BeforeClass
    public static void create(){
        ns = new NotString();
    }

    @Test
    public void shouldReturnNotCandy() {
        assertEquals("not candy", ns.notString("candy"));
    }

    @Test
    public void shouldReturnNotX() {
        assertEquals("not x", ns.notString("x"));
    }

    @Test
    public void shouldReturnNotBad() {
        assertEquals("not bad", ns.notString("not bad"));
    }

    @Test
    public void shouldReturnNot() {
        assertEquals("not", ns.notString("not"));
    }
}
