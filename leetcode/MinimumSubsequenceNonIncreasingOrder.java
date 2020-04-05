//  5376. Minimum Subsequence in Non-Increasing Order

class MinimumSubsequenceNonIncreasingOrder {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length == 0) return result;
        if (nums.length == 1) {
            result.add(nums[0]);
            return result;
        }
        Arrays.sort(nums);
        int index = 0;
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        int s = 0;
        for (int n : nums) {
            s += n;
            if (s >= sum - s) {
                break;
            }
            index++;
        }
        for (int i = index; i < nums.length; i++) {
            result.add(nums[i]);
        }
        Collections.reverse(result);
        return result;
    }
}