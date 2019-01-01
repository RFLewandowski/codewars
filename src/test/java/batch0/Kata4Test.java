package batch0;

import batch0.Kata4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata4Test {
    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", Kata4.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", Kata4.chromosomeCheck("XX"));
    }
}