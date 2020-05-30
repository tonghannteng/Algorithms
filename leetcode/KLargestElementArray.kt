//  215. Kth Largest Element in an Array

class KLargestElementArray {

    fun findKthLargest(nums: IntArray, k: Int): Int {
        val priorityQueue = PriorityQueue<Int>()
        for (element in nums) {
            priorityQueue.add(element)
            if (priorityQueue.size > k) {
                priorityQueue.remove()
            }
        }
        return priorityQueue.remove()
    }
}