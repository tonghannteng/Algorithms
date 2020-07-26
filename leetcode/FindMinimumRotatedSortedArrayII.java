//  154. Find Minimum in Rotated Sorted Array II

class FindMinimumRotatedSortedArrayII {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high]) {  //means min element lies in the left part
                high = mid;
            } else if (nums[mid] > nums[high]) {  //means min element lies in right part
                low = mid + 1;
            } else {  //when element at mid and element at high are equal
                high--;
            }
        }
        return nums[low];
    }
}