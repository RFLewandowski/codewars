package batch0;

import batch0.LetterACounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class letterACounterTest {
    @Test
    public void countANull() throws Exception {
        //given
        //when
        int actual = LetterACounter.countA(null);
        //then
        assertEquals(0, actual);
    }

    @Test
    public void countAEmpty() throws Exception {
        //given
        //when
        int actual = LetterACounter.countA("");
        //then
        assertEquals(0, actual);
    }

    @Test
    public void countASingle() throws Exception {
        //given
        //when
        int actual = LetterACounter.countA("a");
        //then
        assertEquals(1, actual);
    }


    @Test
    public void countAFourAndB() throws Exception {
        //given
        //when
        int actual = LetterACounter.countA("aaaba");
        //then
        assertEquals(4, actual);
    }

}