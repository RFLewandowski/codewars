package batch1;

import java.util.Arrays;

public class Kata10 {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) return 0;
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        return Arrays.stream(numbers).sum() - min - max;
    }
}
