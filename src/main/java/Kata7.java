public class Kata7 {
    public static String solution(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();

//        int length = str.length();
//        StringBuilder result = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            result.append(str.charAt(i));
//        }
//        return result.toString();
//
    }
}