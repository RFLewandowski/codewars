import java.util.Arrays;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays
                .stream(arrayOfSheeps)
                .filter(aBoolean -> aBoolean)
                .count();
    }
}