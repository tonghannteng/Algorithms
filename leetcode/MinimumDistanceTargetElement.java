//  1848. Minimum Distance to the Target Element

class MinimumDistanceTargetElement {

    public int getMinDistance(int[] nums, int target, int start) {
        if (nums.length == 0) return 0;
        int result = 10000;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = Math.min(result, Math.abs(i - start));
            }
        }
        return result;
    }
}