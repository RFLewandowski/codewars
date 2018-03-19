package batch2;

import batch2.Java;
import org.junit.*;

public class JavaTest{
    @Test
    public final void test_all() {
        Assert.assertEquals( "Nope!" , 4, Java.doubleInteger(2)); // Test cases here!
    }
}