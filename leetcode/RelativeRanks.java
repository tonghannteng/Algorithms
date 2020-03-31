//  506. Relative Ranks

class RelativeRanks {

    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = copy.length - 1; i >= 0; i--) {
            map.put(copy[i], copy.length - i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                result[i] = "Gold Medal";
            } else if (map.get(nums[i]) == 2) {
                result[i] = "Silver Medal";
            } else if (map.get(nums[i]) == 3) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(map.get(nums[i]));
            }
        }
        return result;
    }
}