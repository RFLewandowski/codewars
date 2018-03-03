public class Kata4 {
    public static String bonusTime(final int salary, final boolean bonus) {
        return "£" + (bonus ? 10 : 1) * salary;
//        if (bonus) return "£" + 10 * salary;
//        return "£" + salary;
    }
}
