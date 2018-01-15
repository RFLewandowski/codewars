public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] vovels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < vovels.length; i++) {
            int singleVovelCount=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)==vovels[i]) singleVovelCount++;
            }
            vowelsCount+=singleVovelCount;
        }
        return vowelsCount;
    }
}