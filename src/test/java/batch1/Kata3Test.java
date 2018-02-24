package batch1;

import batch1.Kata3;
import org.junit.Test;

import static org.junit.Assert.*;

public class Kata3Test {
    @Test
    public void Test1() {
        assertEquals("42 -9", Kata3.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}