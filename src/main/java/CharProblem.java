public class CharProblem {
    public static int howOld(final String herOld) {
        String age = herOld.substring(0, 1);
        return Integer.valueOf(age);
    }
}