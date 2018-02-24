package batch1;

public class Sum {
    public int GetSum(int a, int b) {
        if (a == b) return a;

        int sum = 0;
        int start = Integer.min(a, b);
        int stop = Integer.max(a, b);
        for (int i = start; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}