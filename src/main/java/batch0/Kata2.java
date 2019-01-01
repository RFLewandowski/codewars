package batch0;

public class Kata2 {
    public static int[] getSize(int w, int h, int d) {
        int volume = w * h * d;
        int surface = 2 * (w * h + h * d + d * w);
        return new int[]{surface, volume};
    }
}