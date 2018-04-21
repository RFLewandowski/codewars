import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata5Test {

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(1, Kata5.hexToDec("1"));
        assertEquals(10, Kata5.hexToDec("a"));
        assertEquals(16, Kata5.hexToDec("10"));
        assertEquals(255, Kata5.hexToDec("FF"));
        assertEquals(-12, Kata5.hexToDec("-C"));
    }
}