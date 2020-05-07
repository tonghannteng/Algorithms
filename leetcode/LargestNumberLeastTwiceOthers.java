//  747. Largest Number At Least Twice of Others

class LargestNumberLeastTwiceOthers {
        public int dominantIndex(int[] nums) {
            int max = nums[0];
            int index = 0;
            for (int i = 1; i < nums.length; i++) {
                if(nums[i] > max) {
                    max = nums[i];
                    index = i;
                }
            }
            for (int n : nums) {
                if (n != max && n*2 > max) return -1;
            }
            return index;
        }
    }