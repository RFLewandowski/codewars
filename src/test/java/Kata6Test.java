import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata6Test {
    @Test
    public void tests() {
        assertEquals("67", Kata6.numberToString(67));
        assertEquals("123", Kata6.numberToString(123));
        assertEquals("999", Kata6.numberToString(999));
    }
}