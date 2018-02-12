public class Chocolate {
    public static int breakChocolate(int n, int m) {
        return Math.max(n * m - 1, 0);

//        if (n <= 0 || m <= 0) return 0;
//        int longer = Integer.max(n, m);
//        int shorter = Integer.min(n, m);
//        return (shorter - 1) + (longer - 1) * shorter;
    }
}