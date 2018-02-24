package batch1;

public class BitCounting {
    public static int countBits(int n) {
        int sumOfOnes = 0;
        while (n > 0) {
            if (n % 2 == 1) sumOfOnes++;
            n /= 2;
        }
        return sumOfOnes;
    }
}