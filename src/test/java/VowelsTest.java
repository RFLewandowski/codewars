import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
        assertEquals("Nope!", 1, Vowels.getCount("e"));
        assertEquals("Nope!", 6, Vowels.getCount("uuuuuu"));
    }
}