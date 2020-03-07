//  7. Reverse Integer

class ReverseInteger {

    public int reverse(int x) {
        long result = 0;
        long negative = 1;
        if (x < 0) {
            negative = -1;
            x = (-1) * x;
        }
        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE) return 0;
        }

        return (int) (result * negative);
    }
}