public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        if (name.substring(0, 1).toLowerCase().equals("r")) return name + " plays banjo";
        return name + " does not play banjo";
    }
}