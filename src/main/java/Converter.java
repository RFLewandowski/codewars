import java.math.BigDecimal;

public class Converter {
    public static final float MPG_TO_KPM_CONSTANT = (float) (0.354006043538214);

    public static float mpgToKPM(final float mpg) {
        BigDecimal bd = new BigDecimal(mpg * MPG_TO_KPM_CONSTANT);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
}