public class StringUtils {
    public static String toAlternativeString(String string) {
        char[] chars = string.toCharArray();
        String result = "";
        for (char aChar : chars) {
            if (Character.isLowerCase(aChar)) result += Character.toUpperCase(aChar);
            else if (Character.isUpperCase(aChar)) result += Character.toLowerCase(aChar);
            else result += aChar;
        }
        return result;
//        return string.chars()
//                .map(c -> isUpperCase(c) ? toLowerCase(c) : isLowerCase(c) ? toUpperCase(c) : c)
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();
    }
}