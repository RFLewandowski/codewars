import java.util.ArrayList;
import java.util.List;

public class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;

        List<Integer> result = new ArrayList<>();

        int longer = Integer.max(lng, wdth);
        int shorter = Integer.min(lng, wdth);
        int field = longer * shorter;

        while (longer > 1 && shorter > 1) {
            field = field - shorter * shorter;
            longer = longer - shorter;
            result.add(shorter);

            if (longer < shorter) {
                int temp = -1;
                temp = longer;
                longer = shorter;
                shorter = temp;
            }
        }
        int rowOfSingles = longer * shorter;
        for (int i = 0; i < rowOfSingles; i++) {
            result.add(1);
        }
        return result;
    }
}
