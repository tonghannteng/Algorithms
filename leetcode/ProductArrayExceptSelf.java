//  238. Product of Array Except Self

class ProductArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] n1 = new int[nums.length];
        int[] n2 = new int[nums.length];
        n1[0] = 1;
        n2[nums.length - 1] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            n1[i + 1] = nums[i] * n1[i];
        }
        for (int i = nums.length - 1; i > 0; i--) {
            n2[i - 1] = nums[i] * n2[i];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = n1[i] * n2[i];
        }
        return result;
    }

}