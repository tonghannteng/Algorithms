//  1877. Minimize Maximum Pair Sum in Array

class MinimizeMaximumPairSumArray {

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int i = 0;
        int j = nums.length - 1;
        while(i < j) {
            max = Math.max(max, nums[i] + nums[j]);
            i++;
            j--;
        }
        return max;
    }
}