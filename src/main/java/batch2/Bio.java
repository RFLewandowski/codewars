package batch2;

public class Bio {
    public String dnaToRna(String dna) {
        char[] dnaMatrix = dna.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aDnaMatrix : dnaMatrix) {
            if (aDnaMatrix == 'T') sb.append('U');
            else sb.append(aDnaMatrix);
        }
        return sb.toString();
    }
}