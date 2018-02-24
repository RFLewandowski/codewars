package batch1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        int number = num;
        List<Integer> numbers = new ArrayList<>();
        while (number >= 1) {
            numbers.add(number % 10);
            number = number / 10;
        }
        numbers.sort(Collections.reverseOrder());

        int result = 0;
        for (int power = numbers.size()-1, index = 0; power >= 0; power--, index++) {
            result = result + (numbers.get(index) * (int) Math.pow(10, power));
        }
        return result;
    }

//    public class batch1.DescendingOrder {
//        public static int sortDesc(final int num) {
//            return Integer.parseInt(String.valueOf(num)
//                    .chars()
//                    .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
//                    .sorted(Comparator.reverseOrder())
//                    .collect(Collectors.joining()));
//        }


//    public static int sortDesc(final int num) {
//        String[] array = String.valueOf(num).split("");
//        Arrays.sort(array, Collections.reverseOrder());
//        return Integer.valueOf(String.join("", array));
//    }
}