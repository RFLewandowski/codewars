package batch0;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void test1() throws Exception {
        String[] name = {"John", "Smith"};
        assertEquals(
                Hello.sayHello(name, "Phoenix", "Arizona"),
                "batch0.Hello, John Smith! batch0.Welcome to Phoenix, Arizona!");
    }
}