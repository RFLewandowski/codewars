import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateTest {
    @Test
    public void testBMI() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }
}