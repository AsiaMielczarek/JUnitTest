package workshop.test.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HasTeenTest {

    HasTeen ht;
    @Before
    public void create(){
        ht = new HasTeen();
    }

    @Test
    public void shouldReturnTrue1() {
        assertTrue(ht.hasTeen(13, 20, 10));
    }

    @Test
    public void shouldReturnTrue2() {
        assertTrue(ht.hasTeen(15, 16, 19));
    }
    @Test
    public void shouldReturnTrue3() {
        assertTrue(ht.hasTeen(11, 19, 10));
    }

    @Test
    public void shouldReturnFalse1() {
        assertFalse(ht.hasTeen(9, 10, 20));
    }

    @Test
    public void shouldReturnFalse2() {
        assertFalse(ht.hasTeen(1, 11, 21));
    }

}

