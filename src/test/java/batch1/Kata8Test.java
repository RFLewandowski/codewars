package batch1;

import batch1.Kata8;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Kata8Test {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Kata8.digitize(35231));
    }
}