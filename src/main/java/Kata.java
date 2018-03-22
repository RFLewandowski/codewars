
public class Kata {
    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (hasIntegerSquateRoot(array[i])) {
                array[i] = (int) Math.sqrt(array[i]);
            } else array[i] *= array[i];
        }
        return array;
    }

    private static boolean hasIntegerSquateRoot(int number) {
        return (long) Math.sqrt(number) * (long) Math.sqrt(number) == (long) number;

    }
}