import org.junit.Test;

import static org.junit.Assert.*;

public class Kata5Test {

    @Test
    public void test1() {
        assertEquals(-42, Kata5.makeNegative(42));
    }

    @Test
    public void test2() {
        assertEquals(-9, Kata5.makeNegative(-9));
    }

    @Test
    public void test3() {
        assertEquals(0, Kata5.makeNegative(0));
    }
}