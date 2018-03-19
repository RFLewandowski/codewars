package batch2;

import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
//        int result = 0;
//        for (int[] stop : stops) {
//            result = result + stop[0] - stop[1];
//        }
//        return result;

            return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }
}