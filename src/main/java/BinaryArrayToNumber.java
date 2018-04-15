import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
//        int len = binary.size();
//        int converted = 0;
//        for (int i = 0, j = 1; i < len; i++, j++) {
//            int digit = binary.get(i) * 2;
//            if (len - j == 0 && digit == 0) return converted;
//            converted += Math.pow(digit, len - j);
//        }
//        return converted;
    }
}