//  75. Sort Colors

class SortColors {

    fun sortColors(nums: IntArray): Unit {
        var count_red = 0
        var count_white = 0
        var count_blue = 0;
        for (i in nums.indices) {
            if (nums[i] == 0) {
                count_red++
            } else if (nums[i] == 1) {
                count_white++
            } else {
                count_blue++
            }
        }
        for (i in 0 until count_red) {
            nums[i] = 0
        }
        for (i in count_red until count_red + count_white) {
            nums[i] = 1
        }
        for (i in count_red + count_white until count_red + count_white + count_blue) {
            nums[i] = 2
        }
    }
}