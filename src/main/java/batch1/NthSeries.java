package batch1;

public class NthSeries {

    public static String seriesSum(int n) {
        Float sum = 0f;
        Float baseDenominator = 1f;

        for (int i = 0; i < n; i++) {
            Float current = 1 / baseDenominator;
            sum = sum + current;
            baseDenominator = baseDenominator + 3;

        }
        String result = String.format ("%.2f", sum);
        return result;
    }
}
