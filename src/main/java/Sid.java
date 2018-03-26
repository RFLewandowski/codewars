public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        if(nb_petals<0) throw new IllegalArgumentException("arguments should be > 0");
        String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};
        return arr[nb_petals%6];

//        switch (nb_petals%6) {
//            case 1:
//                return "I love you";
//            case 2:
//                return "a little";
//            case 3:
//                return "a lot";
//            case 4:
//                return "passionately";
//            case 5:
//                return "madly";
//            case 0:
//                return "not at all";
//            default:
//                throw new IllegalArgumentException("arguments should be > 0");
//        }
    }
}