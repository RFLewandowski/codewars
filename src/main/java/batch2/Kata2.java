package batch2;

public class Kata2 {
    public static int[] invert(int[] array) {
            return java.util.Arrays.stream(array).map(i -> -i).toArray();
//        int length = array.length;
//        int[] inverted = new int[length];
//        for (int i = 0; i < length; i++) {
//            inverted[i] = -array[i];
//        }
//        return inverted;
    }
}