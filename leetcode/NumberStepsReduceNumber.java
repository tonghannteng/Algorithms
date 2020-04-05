//  5377. Number of Steps to Reduce a Number in Binary Representation to One

import java.math.BigInteger;

class NumberStepsReduceNumber {
    public int numSteps(String s) {
        BigInteger num = new BigInteger(s, 2);
        int count = 0;
        while (!num.equals(BigInteger.ONE)) {
            if (num.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                num = num.divide(BigInteger.valueOf(2));
            } else {
                num = num.add(BigInteger.ONE);
            }
            count++;
        }
        return count;
    }
}