//  986. Interval List Intersections

import java.util.ArrayList
import kotlin.math.max
import kotlin.math.min

class IntervalListIntersections {

    fun intervalIntersection(A: Array<IntArray>, B: Array<IntArray>): Array<IntArray> {
        val result = ArrayList<IntArray>()
        var i = 0
        var j = 0
        while (i < A.size && j < B.size) {
            val low = max(A[i][0], B[j][0])
            val high = min(A[i][1], B[j][1])
            if (low <= high) {
                result.add(intArrayOf(low, high))
            }
            if (A[i][1] < B[j][1]) {
                i++
            } else {
                j++
            }
        }
        return result.toArray(arrayOfNulls<IntArray>(result.size))
    }
}