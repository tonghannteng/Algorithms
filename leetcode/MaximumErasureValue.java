//  1695. Maximum Erasure Value

class MaximumErasureValue {

    public int maximumUniqueSubarray(int[] nums) {
        int max = 0;
        int pointer_a = 0;
        int pointer_b = 0;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        while (pointer_a < nums.length && pointer_b < nums.length) {
            if (!set.contains(nums[pointer_b])) {
                set.add(nums[pointer_b]);
                sum+=nums[pointer_b];
                pointer_b++;
                max = Math.max(max, sum);
            } else {
                set.remove(nums[pointer_a]);
                sum-=nums[pointer_a];
                pointer_a++;
            }
        }
        return max;
    }
}