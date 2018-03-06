public class Kata6 {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";

        String p1w = "Player 1 won!";
        String p2w = "Player 2 won!";

        if(p1.equals("scissors") && p2.equals("paper")) return p1w;
        if(p2.equals("scissors") && p1.equals("paper")) return p2w;

        if(p1.equals("scissors") && p2.equals("rock")) return p2w;
        if(p2.equals("scissors") && p1.equals("rock")) return p1w;

        if(p1.equals("rock") && p2.equals("paper")) return p2w;
        if(p2.equals("rock") && p1.equals("paper")) return p1w;

        throw new IllegalArgumentException("unexpected argument");
    }
}
