package batch0;

import java.util.Arrays;

public class Competition {
    public static void main(String[] args) {
        Arrays.stream(new Byte[] {21, 0, 21, 17}).map(b -> (char) (b + 'a')).forEach(System.out::print);
    }
}
