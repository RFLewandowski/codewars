import java.util.ArrayList;
import java.util.List;

public class RomanToArabic {
    public enum Roman {
        I(1), V(5), X(10), L(50), C(100), M(1000);
        private final int value;

        Roman(int value) {
            this.value = value;
        }

        public int toInt() {
            return value;
        }

        public boolean shouldCombine(Roman next) {
            return this.value < next.value;
        }

        public int toInt(Roman next) {
            return next.value - this.value;
        }
    }

    static Integer convert(String input) {
        if (input == null || input.isEmpty()) return null;
        List<Roman> romans = new ArrayList<>();
        input
                .chars()
                .mapToObj(c -> ((char) c))
                .map(c -> Roman.valueOf(c.toString()))
                .forEach(romans::add);

        int value = 0;
        while (!romans.isEmpty()) {
            Roman current = romans.remove(0);
            if (!romans.isEmpty() && current.shouldCombine(romans.get(0)))
                value += current.toInt(romans.remove(0));
            else
                value += current.toInt();
        }
        return value;
    }
}
