//  53. Maximum Subarray

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int result = nums[0];
        int sum = 0;
        for (int n : nums) {
            sum += n;
            if (sum > result) {
                result = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return result;
    }
}