package batch1;

import java.util.ArrayList;

public class Kata8 {
    public static int[] digitize(long n) {

        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();

//        ArrayList<Integer> tempResult = new ArrayList<>();
//        int digit;
//        while (n > 0) {
//            digit = (int) (n % 10);
//            tempResult.add(digit);
//            n /= 10;
//        }
//
//        int[] result = new int[tempResult.size()];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = tempResult.get(i);
//        }
//        return result;
    }
}