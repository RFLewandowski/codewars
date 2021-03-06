package batch1;

import batch1.SortArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortArrayTest {
    @Test
    public void intArrayTest() {
        int[] ai = {1, 2, 3};
        int[] uai = {2, 3, 1};
        assertEquals(ai[0], SortArray.sortArray(uai)[0]);
        assertEquals(ai[1], SortArray.sortArray(uai)[1]);
        assertEquals(ai[2], SortArray.sortArray(uai)[2]);
    }
}