//  414. Third Maximum Number

class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        if (nums.length < 3) {
            int max = 0;
            for (int n : nums) {
                max = Math.max(max, n);
            }
            return max;
        }
        Arrays.sort(nums);
        int count = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                count++;
            }
            if (count == 2) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}