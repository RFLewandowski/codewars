package batch2;

import batch2.Solution;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", Solution.removeExclamationMarks("Hello World!"));
    }
}