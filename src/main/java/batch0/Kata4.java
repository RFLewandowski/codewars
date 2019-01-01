package batch0;

public class Kata4 {
    public static String chromosomeCheck(String sperm) {
        return "Congratulations! You're going to have a " + (sperm.contains("Y") ? "son." : "daughter.");
    }
}
