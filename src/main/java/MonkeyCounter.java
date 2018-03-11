import java.util.stream.IntStream;

public class MonkeyCounter {
    public static int[] monkeyCount(final int n) {
        return IntStream.rangeClosed(1, n).toArray();

//        int[] result = new int[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = i + 1;
//        }
//        return result;
    }
}