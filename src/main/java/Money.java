public class Money {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        if (principal >= desired) return 0;
        double currentCapital = principal;

        int year = 0;
        for (; currentCapital < desired; year++) {
            currentCapital += (currentCapital * interest) * (1 - tax);
        }
        return year;
    }
}