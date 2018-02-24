package batch1;

public class Square {
    public static boolean isSquare(int n) {

       int lstDgt=n-(n%10);
       if (lstDgt==2||lstDgt==3||lstDgt==7||lstDgt==8) return false;

        int sqrt = (int) Math.sqrt(n);

        if(sqrt*sqrt==n)return true;
        return false;
    }
}