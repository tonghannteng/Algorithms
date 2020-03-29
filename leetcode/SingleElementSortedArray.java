//  540. Single Element in a Sorted Array

class SingleElementSortedArray {

    public int singleNonDuplicate(int[] nums) {
        int sumAll = 0;
        int sum = 0;
        for(int n: nums) {
            sumAll+=n;
        }
        for (int i = 0; i < nums.length; i+=2) {
            sum+=nums[i];
        }
        return sum*2 - sumAll;
    }
}