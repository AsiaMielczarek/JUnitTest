package workshop.test.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IcyHotTest {

    @Test
    public void bothTrue() {
        assertEquals(true, new IcyHot().icyHot(-4, 110));
    }

    @Test
    public void bothFalse() {
        assertEquals(false, new IcyHot().icyHot(12, 40));
    }

    @Test
    public void oneTrue(){
        assertEquals(false, new IcyHot().icyHot(-30, 40));
    }
}
