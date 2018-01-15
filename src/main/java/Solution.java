public class Solution {

    public int solution(int number) {

        int solution = 0;
        for (int i = 0; i < number; i += 3) {
            solution+=i;
        }
        for (int i = 0; i < number; i += 5) {
            if (i % 3 != 0) solution+=i;
        }
        return solution;
    }
}