package batch2;

public class Kata9 {
    private final static int COST_PER_DAY = 40;
    public static int rentalCarCost(int d) {
        if (d >= 7) return d * COST_PER_DAY - 50;
        else if (d >= 3) return d * COST_PER_DAY - 20;
        return d * COST_PER_DAY;
    }
}
