package batch1;

public class SquareDigit {

    public int squareDigits(int n) {
        String sourceS = Integer.toString(n);
        StringBuilder resultS = new StringBuilder();

        for (int i = 0; i < sourceS.length(); i++) {
            Integer factor = Character.getNumericValue(sourceS.charAt(i));
            Integer product = factor * factor;
            resultS.append(product);
        }
        return new Integer(resultS.toString());
    }
}