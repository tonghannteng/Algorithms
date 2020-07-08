//  15. 3Sum

class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        int i = 0, j, k, n = nums.length;
        if (n == 0) return new ArrayList<>();
        for (i = 0; i < n; i++) {
            j = i + 1;
            k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0)
                    result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if (sum > 0) k--;
                else if (sum < 0) j++;
            }
        }
        return new ArrayList<>(result);
    }
}

