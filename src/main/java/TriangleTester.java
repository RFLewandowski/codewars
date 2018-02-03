import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        List<Integer> orderedSides = asList(a, b, c);
        orderedSides.sort(Comparator.reverseOrder());
        int longest = orderedSides.get(0);

        return 2 * (longest) < a + b + c;
    }
}