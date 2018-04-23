import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution3Test {
    @Test
    public void testAddFive() {
        assertEquals(10, Solution3.addFive(5));
    }

    @Test
    public void testAddZero() {
        assertEquals(5, Solution3.addFive(0));
    }

    @Test
    public void testAddNegativeFive() {
        assertEquals(0, Solution3.addFive(-5));
    }

    @Test
    public void testRandom() {
        for (int i = 0; i < 50; i++) {
            int rand = (int) (Math.random() * 1000) + 1;
            assertEquals(rand + 5, Solution3.addFive(rand));
        }
    }
}