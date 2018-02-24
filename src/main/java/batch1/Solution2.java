package batch1;

public class Solution2 {
    public static String repeatStr(final int repeat, final String string) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            result.append(string);
        }
        return result.toString();
    }
}
