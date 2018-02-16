import java.util.Arrays;

public class Kata9 {
    public static String findNeedle(Object[] haystack) {

        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
//
//        for (int i = 0; i < haystack.length; i++) {
//            if (haystack[i]=="needle") return "found the needle at position " + i;
//        }
//        return "no needle";
    }
}
