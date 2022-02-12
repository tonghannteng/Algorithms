//  1913. Maximum Product Difference Between Two Pairs

class MaximumProductDifferenceTwoPairs {

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}