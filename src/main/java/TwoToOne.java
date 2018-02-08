import java.util.TreeSet;

public class TwoToOne {

    public static String longest(String s1, String s2) {

        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

//        StringBuilder sb = new StringBuilder();
//        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
//        return sb.toString();

//        char[] connected = (s1 + s2).toCharArray();
//
//        TreeSet<Character> sortedS = new TreeSet();
//        for (char c : connected) {
//            sortedS.add(c);
//        }
//
//        StringBuilder result = new StringBuilder();
//        for (Character character : sortedS) {
//            result.append(character);
//        }
//
//        return result.toString();
    }
}