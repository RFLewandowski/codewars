package batch0;

import java.util.Arrays;

public class Hello {
    public static String sayHello(String[] name, String city, String state) {
        return String.format("batch0.Hello, %s! batch0.Welcome to %s, %s!",String.join(" ", name),city,state);

//        String nameStr = Arrays.toString(name);
//        nameStr = nameStr.substring(1, nameStr.length() - 1).replaceAll(",", "");
//        return "batch0.Hello, " + nameStr + "! batch0.Welcome to " + city + ", " + state + "!";
    }
}