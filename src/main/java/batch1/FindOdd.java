package batch1;

import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.stream;

public class FindOdd {
    public static int findIt(int[] A) {

        return stream(A).reduce(0, (x, y) -> x ^ y);
//        Map<Integer, Integer> numbers = new HashMap<>();
//        for (int number : A) {
//            if (!numbers.containsKey(number)) {
//                numbers.put(number, 0);
//            } else {
//                numbers.put(number, numbers.get(number) + 1);
//            }
//        }
//
//        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
//
//            if (entry.getValue() % 2 == 0) return entry.getKey();
//        }
//        return -999999999;
    }
}