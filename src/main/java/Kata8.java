public class Kata8 {
    public static String stringy(int size) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) stringBuilder.append("1");
            else stringBuilder.append("0");
        }
        return stringBuilder.toString();

//        public static String stringy(int size) {
//            return IntStream.rangeClosed(1, size)
//                    .map(i -> i % 2)
//                    .mapToObj(String::valueOf)
//                    .collect(Collectors.joining(""));
//        }
    }
}