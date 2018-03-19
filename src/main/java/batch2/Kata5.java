package batch2;

import java.util.ArrayList;
import java.util.List;

class Kata5 {
    public static List CreateList(int number) {
        List listSerie = new ArrayList();
        for (int count = 1; count <= number; count++) {
            listSerie.add(count);
        }
        return listSerie;
    }
}