import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPrinter {

    public static String printArray(Object[] array) {
        return Arrays
                .asList(array)
                .stream()
                .map(o -> o.toString())
                .collect(Collectors.joining(","));
    }
}