import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSecMapTest {

    @Test
    public void Should_GetValue_When_BeforeFiveSec() throws Exception {
        //Given
        TwoSecMap twoSecMap = new TwoSecMap();
        //When
        twoSecMap.put(1, "one");
        String result = twoSecMap.get(1);
        //Then
        assertEquals("one", result);

    }

    @Test
    public void Should_NotGetValue_When_AfterFiveSec() throws Exception {
        //Given
        TwoSecMap twoSecMap = new TwoSecMap();
        //When
        twoSecMap.put(1, "one");
        Thread.sleep(2001);
        String result = twoSecMap.get(1);
        //Then
        assertEquals("", result);
    }
}