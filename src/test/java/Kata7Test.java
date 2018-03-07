import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata7Test {

    private static final double delta = 0.0001;

    @Test
    public void examples() {
        assertEquals(4, Kata7.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, Kata7.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}
