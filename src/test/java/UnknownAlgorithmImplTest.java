import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UnknownAlgorithmImplTest {
    @Test
    public void doCalculation() throws Exception {
        //Given
        List<Integer> input = Arrays.asList(0, 3, 2, 3, 3, 3);
        ;
        //When
        List<Integer> result = UnknownAlgorithmImpl.doCalculation(input);
        //Then
        assertEquals(new ArrayList<>(), result);
    }
}