//  674. Longest Continuous Increasing Subsequence

class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int max = 1;
        int current = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                current++;
            } else {
                current = 1;
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}