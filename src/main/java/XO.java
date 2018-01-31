public class XO {

    public static boolean getXO(String str) {
        long numX = countChar(str, 'x');
        long numO = countChar(str, 'o');
        return numX == numO;
    }

    private static long countChar(String str, char charToCount) {
        return str
                .toLowerCase()
                .chars()
                .filter(value -> value == charToCount)
                .count();

    }
}