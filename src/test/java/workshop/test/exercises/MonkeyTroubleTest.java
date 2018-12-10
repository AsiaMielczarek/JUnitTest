package workshop.test.exercises;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MonkeyTroubleTest {

    @Test
    public void bothSmiling() {
        MonkeyTrouble mt = new MonkeyTrouble();
        assertTrue(mt.monkeyTrouble(true, true));
    }

    @Test
    public void noOneSmiling() {
        MonkeyTrouble mt = new MonkeyTrouble();
        assertTrue(mt.monkeyTrouble(false, false));
    }

    @Test
    public void somebodySmiling() {
        MonkeyTrouble mt = new MonkeyTrouble();
        assertFalse(mt.monkeyTrouble(true, false));
    }

    @Test
    public void somebodyElseSmiling() {
        MonkeyTrouble mt = new MonkeyTrouble();
        assertFalse(mt.monkeyTrouble(false, true));
    }
}

