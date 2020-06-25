//  287. Find the Duplicate Number

class FindDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int r = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[Math.abs(nums[i])] > 0) {
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            } else {
                r = Math.abs(nums[i]);
            }
        }
        return r;
    }
}