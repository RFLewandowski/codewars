package batch1;

import batch1.Kata4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Javatlacati on 01/03/2017.
 */
public class Kata4Test {
    @Test
    public void findShort() throws Exception {
        assertEquals(3, Kata4.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Kata4.findShort("turns out random test cases are easier than writing out basic ones"));
    }

}