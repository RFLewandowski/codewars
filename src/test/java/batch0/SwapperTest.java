package batch0;

import batch0.Swapper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapperTest {

    @Test
    public void testSomething() {
        Integer[] args = new Integer[]{1, 2};

        Swapper r = new Swapper(args);
        r.swapValues();
        assertEquals("Failed swapping numbers", 2, r.getArguments()[0]);
        assertEquals("Failed swapping numbers", 1, r.getArguments()[1]);
    }
}