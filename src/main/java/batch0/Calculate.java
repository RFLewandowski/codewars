package batch0;

public class Calculate {
    public static String bmi(double weight, double height) {
        double bmi = exactBmi(weight, height);
        if (bmi <= 18.5) return "Underweight";
        if (bmi <= 25.0) return "Normal";
        if (bmi <= 30.0) return "Overweight";
        return "Obese";
    }

    public static double exactBmi(double weight, double height) {
        return weight / (height * height);
    }
}