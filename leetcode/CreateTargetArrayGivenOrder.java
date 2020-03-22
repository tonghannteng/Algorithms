//  1389. Create Target Array in the Given Order

class CreateTargetArrayGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < index.length; i++) {
            if (result[index[i]] != -1) {
                int[] arr = Arrays.copyOf(result, result.length);
                for (int j = index[i] + 1; j < result.length; j++) {
                    result[j] = arr[j - 1];
                }
            }
            result[index[i]] = nums[i];
        }
        return result;
    }
}