package batch1;

public class StringToNumber {
    public static int stringToNumber(String str) {
        System.out.println(str.substring(1,str.length()-1));
        return Integer.decode(str);
    }
}