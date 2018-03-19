package batch2;

import batch2.ToString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ToStringTest {
    @Test
    public void MaseksNoSense() {
        assertEquals("123", ToString.FOO);
    }
}
