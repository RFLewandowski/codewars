package batch1;

public class NumberFun {
    public static long findNextSquare(long sq) {
        long root = (long) Math.sqrt(sq);
        if (root * root == sq) return (root + 1) * (root + 1);
        else return -1;

        //long root = (long) Math.sqrt(sq);
        //return root * root == sq ? (root + 1) * (root + 1) : -1;
    }
}