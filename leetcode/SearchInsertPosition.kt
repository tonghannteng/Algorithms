//  35. Search Insert Position

class SearchInsertPosition {

    fun searchInsert(nums: IntArray, target: Int): Int {
        val l = nums.size
        for (i in nums.indices) {
            if (nums[i] >= target) {
                return i
            }
        }
        return l
    }
}