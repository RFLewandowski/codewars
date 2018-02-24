package batch1;

import java.util.Arrays;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int result = 0;
        try {
            result = (int) Arrays
                    .stream(arrayOfSheeps)
                    .filter(x -> x!=null)
                    .filter(aBoolean -> aBoolean)
                    .count();
        } catch (Exception e) {
            e.printStackTrace();
            return result;
        }
        return result;
    }
}