import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToArabicTest {
    @Test
    public void Should_convertCase1() throws Exception {
        //Given
        String roma = "CLCLC";
        //When
        Integer result = RomanToArabic.convert(roma);
        //Then
        assertEquals(Integer.valueOf(200), result);
    }

    @Test
    public void Should_convertCase2() throws Exception {
        //Given
        String roma = "MCLX";
        //When
        Integer result = RomanToArabic.convert(roma);
        //Then
        assertEquals(Integer.valueOf(1160), result);
    }

    @Test
    public void Should_convertCase3() throws Exception {
        //Given
        String roma = "CXL";
        //When
        Integer result = RomanToArabic.convert(roma);
        //Then
        assertEquals(Integer.valueOf(140), result);
    }

    @Test
    public void Should_convertCase4() throws Exception {
        //Given
        String roma = "";
        //When
        Integer result = RomanToArabic.convert(roma);
        //Then
        assertEquals(null, result);
    }

    @Test
    public void Should_convertCase5() throws Exception {
        //Given
        String roma = null;
        //When
        Integer result = RomanToArabic.convert(roma);
        //Then
        assertEquals(null, result);
    }

}