package batch2;

import batch2.HelloWorld;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testSomething() {
        assertEquals("hello world!", HelloWorld.greet());
    }
}