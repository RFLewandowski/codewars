package batch1;

import batch1.Counter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CounterTest {
    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            null,  true,  true,  true ,
            false, false, true,  true };

    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 17, new Counter().countSheeps(array1));
    }
}