public class LetterACounter {

    static int countA(String word) {
        if (word == null || "".equals(word)) return 0;
        return (int) word
                .chars()
                .filter(letter -> 'a' == letter)
                .count();
    }
}
