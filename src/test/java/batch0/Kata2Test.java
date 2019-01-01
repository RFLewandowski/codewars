package batch0;

import batch0.Kata2;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Kata2Test {
    @Test
    public void test1() {
        assertArrayEquals(new int[]{88, 48}, Kata2.getSize(4, 2, 6));
        assertArrayEquals(new int[]{6, 1}, Kata2.getSize(1, 1, 1));
        assertArrayEquals(new int[]{10, 2}, Kata2.getSize(1, 2, 1));
        assertArrayEquals(new int[]{16, 4}, Kata2.getSize(1, 2, 2));
        assertArrayEquals(new int[]{600, 1000}, Kata2.getSize(10, 10, 10));
    }
}