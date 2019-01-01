package batch0;

import batch0.Welcome;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WelcomeTest {
    @Test
    public void exampleTest() {
        assertEquals("Your function should have returned 'batch0.Welcome'. Try again.", "batch0.Welcome", Welcome.greet("english"));
        assertEquals("Your function should have returned 'Welkom'. Try again.", "Welkom", Welcome.greet("dutch"));
        assertEquals("Your function should have returned 'batch0.Welcome'. Try again.", "batch0.Welcome", Welcome.greet("IP_ADDRESS_INVALID"));
    }
}