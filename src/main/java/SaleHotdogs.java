public class SaleHotdogs {
    public static int saleHotdogs(final int n) {
        return n * pricePerPiece(n);
    }

    private static int pricePerPiece(int n) {
        if (n >= 10) return 90;
        else if (n >= 5) return 95;
        else return 100;
    }
}