//  441. Arranging Coins

import java.math.BigInteger;

class ArrangingCoins {
    public int arrangeCoins(int n) {
        if (n == 1 || n == 2) return 1;
        BigInteger sum = BigInteger.ZERO;
        int count = 0;
        for (int i = 1; ; i++) {
            sum = sum.add(BigInteger.valueOf(i));
            if (sum.compareTo(BigInteger.valueOf(n)) > 0) {
                return count;
            }
            count++;
        }
    }
}