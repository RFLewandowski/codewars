package batch2;

import batch2.Kata0;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata0Test {
    @Test
    public void basicTests() {
        assertEquals("One", Kata0.switchItUp(1));
        assertEquals("Three", Kata0.switchItUp(3));
        assertEquals("Five", Kata0.switchItUp(5));
    }
}