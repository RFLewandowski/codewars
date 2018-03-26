package batch1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CounterTest {
    Boolean[] array1 = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            null, true, true, true,
            false, false, true, true};

    @Test
    public void test() {
        assertEquals("There are 16 sheeps in total", 16, new Counter().countSheeps(array1));
    }
}