import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberTest {

    @Test
    public void test() {
        assertEquals(true, Number.isEven(0));
        assertEquals(false, Number.isEven(0.5));
        assertEquals(false, Number.isEven(1));
        assertEquals(true, Number.isEven(2));
        assertEquals(true, Number.isEven(-4));
    }
}
