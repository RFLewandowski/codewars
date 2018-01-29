public class Accumul {

    public static String accum(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            String letter = s.substring(i, i + 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0) letter = letter.toUpperCase();
                sb = sb.append(letter);
                letter = letter.toLowerCase();
            }
            sb.append("-");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}