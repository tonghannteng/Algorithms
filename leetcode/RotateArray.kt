//  189. Rotate Array

class RotateArray {

    fun rotate(nums: IntArray, k: Int): Unit {
        for (i in 0 until k) {
            val temp = nums[nums.size - 1]
            var j = nums.size - 1
            while (j >= 1) {
                nums[j] = nums[j - 1]
                j--
            }
            nums[0] = temp
        }
    }
}