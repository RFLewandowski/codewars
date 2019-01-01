package batch1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {
    @Test
    public void test4a() {
        assertEquals("aaaa", Solution2.repeatStr(4, "a"));
    }

    @Test
    public void test3Hello() {
        assertEquals("HelloHelloHello", Solution2.repeatStr(3, "batch0.Hello"));
    }

    @Test
    public void test5empty() {
        assertEquals("", Solution2.repeatStr(5, ""));
    }

    @Test
    public void test0kata() {
        assertEquals("", Solution2.repeatStr(0, "kata"));
    }

    @Test
    public void testNegativeRepeat() {
        assertEquals("", Solution2.repeatStr(-10, "kata"));
    }
}