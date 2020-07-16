//  50. Pow(x, n)

class Powxn {
    public double myPow(double x, int n) {
        double result = 1.0;
        if (n < 0) {
            x = 1.0 / x;
        }
        while (n != 0) {
            if (n % 2 != 0) {
                result *= x;
            }
            n /= 2;
            x *= x;
        }
        return result;
    }
}