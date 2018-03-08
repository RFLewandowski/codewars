import java.util.Random;

public class Ghost {
    private String[] colorCodes = new String[]{"white", "yellow", "purple", "red"};
    private String color = "";

    public Ghost() {
        color = colorCodes[new Random().nextInt(colorCodes.length)];
    }

    public String getColor() {
        return color;
    }
}