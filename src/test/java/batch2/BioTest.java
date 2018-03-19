package batch2;

import batch2.Bio;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BioTest {
    @Test
    public void testDna() throws Exception {
        Bio b = new Bio();
        assertEquals(b.dnaToRna("TTTT"), "UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() throws Exception {
        Bio b = new Bio();
        assertEquals(b.dnaToRna("GCAT"), "GCAU", b.dnaToRna("GCAT"));
    }
}