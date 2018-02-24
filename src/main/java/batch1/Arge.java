package batch1;

class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {

        int currentPop = p0;
        int year = 0;
        for (; currentPop <= p; year++) {
            currentPop +=(int) (((currentPop * percent) / 100) + aug);
        }
        return year;
    }
}