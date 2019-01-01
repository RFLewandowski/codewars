package batch0;

import java.util.Arrays;

public class GrassHopper {

    public static int findAverage(int[] nums) {

        return (int) Arrays.stream(nums)
                .average()
                .getAsDouble();
    }
}