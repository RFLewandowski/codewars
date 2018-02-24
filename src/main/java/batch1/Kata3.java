package batch1;

public class Kata3 {
    public static String HighAndLow(String numbers) {
        String[] numbersSA = numbers.split(" ");
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;

        for (String s : numbersSA) {
            Integer currentValue = Integer.valueOf(s);
            if (currentValue > max) max = currentValue;
            if (currentValue < min) min = currentValue;
        }
        return max.toString() + " " + min.toString();
    }
}