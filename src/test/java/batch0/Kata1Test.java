package batch0;

import batch0.Kata1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata1Test {
    @Test
    public void tests() {
        assertEquals(true, Kata1.betterThanAverage(new int[]{2, 3}, 5));
        assertEquals(true, Kata1.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, Kata1.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, Kata1.betterThanAverage(new int[]{100, 90}, 11));
    }
}