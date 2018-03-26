import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SidTest {
    @Test
    public void Should_processValidNumbers() {
        assertEquals("I love you", Sid.howMuchILoveYou(1));
        assertEquals("a little", Sid.howMuchILoveYou(2));
        assertEquals("not at all", Sid.howMuchILoveYou(6));
        assertEquals("I love you", Sid.howMuchILoveYou(7));
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void Should_throwException() throws IllegalArgumentException {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("arguments should be > 0");
        Sid.howMuchILoveYou(-1);
    }
}