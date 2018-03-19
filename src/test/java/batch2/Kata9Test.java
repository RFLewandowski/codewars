package batch2;

import batch2.Kata9;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata9Test {
    @Test
    public void under3Tests() {
        assertEquals(40, Kata9.rentalCarCost(1));
        assertEquals(80, Kata9.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, Kata9.rentalCarCost(3));
        assertEquals(140, Kata9.rentalCarCost(4));
        assertEquals(180, Kata9.rentalCarCost(5));
        assertEquals(220, Kata9.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, Kata9.rentalCarCost(7));
        assertEquals(270, Kata9.rentalCarCost(8));
        assertEquals(310, Kata9.rentalCarCost(9));
        assertEquals(350, Kata9.rentalCarCost(10));
    }
}