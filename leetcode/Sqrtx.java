//  69. Sqrt(x)

class Sqrtx {

    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left <= right) {
            long mid = ((long) left + (long) right) / 2;
            if (mid * mid == x) return (int) mid;
            if (x < mid * mid) {
                right = (int) mid - 1;
            } else {
                left = (int) mid + 1;
            }
        }
        return right;
    }
}