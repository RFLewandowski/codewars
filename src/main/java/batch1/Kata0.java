package batch1;

import java.util.Arrays;

public class Kata0 {
    public int min(int[] list) {
        return Arrays
                .stream(list)
                .min()
                .getAsInt();
    }

    public int max(int[] list) {
        return Arrays
                .stream(list)
                .max()
                .getAsInt();
    }
}
