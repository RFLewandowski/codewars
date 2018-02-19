import java.util.stream.IntStream;

public class GrassHopper {

    public static int summation(int n) {
        return IntStream.rangeClosed(1,n).sum();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        return sum;
    }
}