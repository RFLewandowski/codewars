public class Maskify {
    public static String maskify(String str) {
        if (str.length() <= 4) return str;
        else {
            int notMaskedLength = str.length() - 4;
            String ending = str.substring(notMaskedLength);
            String filling = "";
            for (int i = 0; i < notMaskedLength; i++) {
                filling += "#";
            }
            return filling + ending;
        }

    }
}