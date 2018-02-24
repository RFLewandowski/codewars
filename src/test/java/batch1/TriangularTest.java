package batch1;

import batch1.Triangular;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangularTest {
    @Test
    public void triangular() throws Exception {
        assertEquals(3, Triangular.triangular(2));
    }
}