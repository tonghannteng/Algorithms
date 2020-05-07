//  633. Sum of Square Numbers

class SumSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            int sum = left * left + right * right;
            if (sum == c) return true;
            else if (sum > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}