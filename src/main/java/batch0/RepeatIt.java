package batch0;

public class RepeatIt {

    public static String repeatString(final Object toRepeat, final int n) {
        if (!(toRepeat instanceof String)) return "\"Not a string\"";
        String result = "";
        for (int i = 0; i < n; i++) {
            result += toRepeat;
        }
        return result;
    }
}