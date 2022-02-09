//  1920. Build Array from Permutation

class BuildArrayPermutation {

    public int[] buildArray(int[] nums) {
        int [] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}

