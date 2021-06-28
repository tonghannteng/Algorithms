//  1800. Maximum Ascending Subarray Sum

class MaximumAscendingSubarraySum {

    public int maxAscendingSum(int[] nums) {
        if (nums.length == 0) return 0;
        int m = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                sum+=nums[i];
            } else {
                sum = nums[i];
            }
            m = Math.max(m, sum);
        }
        return m;
    }
}