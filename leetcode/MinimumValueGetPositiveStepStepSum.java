//  1413. Minimum Value to Get Positive Step by Step Sum

class MinimumValueGetPositiveStepStepSum {

    public int minStartValue(int[] nums) {
        int result = 0;
        int sum = 0;
        for (int n: nums) {
            sum+=n;
            if (result > sum) {
                result = sum;
            }
        }
        return Math.abs(result) + 1;
    }
}