package batch0;

import java.util.Arrays;

public class Kata1 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int averagePoints = (int) Arrays
                .stream(classPoints)
                .average()
                .orElseThrow(IllegalArgumentException::new);
        return yourPoints > averagePoints;
    }
}