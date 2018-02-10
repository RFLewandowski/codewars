import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Printer {

    public static String printerError(String s) {

        return s.replaceAll("[a-m]", "").length() + "/" + s.length();

//        Pattern p = Pattern.compile("[a-m]");
//        Matcher m = p.matcher(s);
//
//        Integer correctLetters = 0;
//        while (m.find()) correctLetters++;
//
//        Integer denominator = s.length();
//        Integer numerator = denominator - correctLetters;
//        return numerator + "/" + denominator;
    }
}