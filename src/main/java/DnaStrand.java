import java.util.Set;

public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] dnaMatrix =dna.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aDnaMatrix : dnaMatrix) {
            if (aDnaMatrix == 'A') sb.append('T');
            if (aDnaMatrix == 'T') sb.append('A');
            if (aDnaMatrix == 'C') sb.append('G');
            if (aDnaMatrix == 'G') sb.append('C');

        }
        return sb.toString();
    }
}