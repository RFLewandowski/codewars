import java.util.Arrays;

public class Hello {
    public static String sayHello(String[] name, String city, String state) {
        return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);

//        String nameStr = Arrays.toString(name);
//        nameStr = nameStr.substring(1, nameStr.length() - 1).replaceAll(",", "");
//        return "Hello, " + nameStr + "! Welcome to " + city + ", " + state + "!";
    }
}