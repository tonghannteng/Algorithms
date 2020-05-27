//  525. Contiguous Array

import kotlin.math.max

class ContiguousArray {
    fun findMaxLength(nums:IntArray): Int {
        var result = 0
        val hashMap = HashMap < Int, Int>()
        hashMap[0] = 0
        var sum = 0
        for (i in nums.indices) {
            if (nums[i] == 0) {
                sum++
            } else {
                sum--
            }
            if (hashMap[sum] == null) {
                hashMap[sum] = i + 1
            } else {
                result = max(result, (i + 1) - hashMap[sum] !!)
            }
        }
        return result
    }
}