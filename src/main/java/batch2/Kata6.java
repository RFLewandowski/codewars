package batch2;

public class Kata6 {
    public static String rps(String p1, String p2) {
        validateArgs(p1, p2);
        if (p1.equals(p2)) return "Draw!";
        if ((p1.equals("scissors") && p2.equals("paper"))
                || (p2.equals("scissors") && p1.equals("rock"))
                || (p2.equals("rock") && p1.equals("paper")))
            return "Player 1 won!";
        else return "Player 2 won!";
    }

    private static void validateArgs(String p1, String p2) {
        if ((p1.equals("scissors") || p1.equals("rock") || p1.equals("paper"))
                && (p2.equals("scissors") || p2.equals("rock") || p2.equals("paper")))
            ;
        else throw new IllegalArgumentException("unexpected argument");
    }

//    public static String rps(String p1, String p2) {
//        return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";
//    }

//    public static String rps(String p1, String p2) {
//        if(p1 == p2) return "Draw!";
//        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
//        return "Player " + p + " won!";
//    }
}
