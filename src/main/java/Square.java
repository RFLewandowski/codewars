public class Square {
    public static boolean isSquare(int n) {
        for (int i = 0; i <=(n/2) ; i++) {
            if(i*i==n) return true;
        }
        return false;
    }
}