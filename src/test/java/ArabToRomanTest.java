import org.junit.Test;
import static org.junit.Assert.*;

public class ArabToRomanTest {

  @Test
  public void Should_convertCase1() {
    //Given
    int arab = 123;
    //When
  String result=ArabToRoman.convert(arab);
    //Then
    assertEquals("CXXIII",result);
  }

  @Test
  public void Should_convertCase2() {
    //Given
    int arab = 321;
    //When
    String result=ArabToRoman.convert(arab);
    //Then
    assertEquals("CCCXXI",result);
  }

  @Test
  public void Should_convertCase3() {
    //Given
    int arab = 666;
    //When
    String result=ArabToRoman.convert(arab);
    //Then
    assertEquals("DCLXVI",result);
  }

}
