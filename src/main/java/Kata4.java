import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata4 {
    public static int findShort(String s) {

        return Arrays.stream(s.split(" "))
                .map(String::length)
                .sorted()
                .collect(Collectors.toList()).get(0);

//        return Stream.of(s.split(" "))
//                .mapToInt(String::length)
//                .min()
//                .getAsInt();
    }
}