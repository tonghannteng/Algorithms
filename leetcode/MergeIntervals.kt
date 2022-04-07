//  56. Merge Intervals

class MergeIntervals {

    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { it.first() }
        // intervals.sortWith(compareBy({it[0]}, {it[1]}))
        val result = ArrayList<IntArray>()
        var p = intervals[0][0]
        var c = intervals[0][1]
        val arr = IntArray(2)
        for (i in 1 until intervals.size) {
            val current = intervals[i]

            if (current[0] <= c) {
                c = c.coerceAtLeast(current[1])
            } else {
                val arr = IntArray(2)
                arr[0] = p
                arr[1] = c
                // print("${p} ${c} ")
                result.add(arr)
                p = current[0]
                c = current[1]
                // print("${result[0][0]} ${result[0][1]} ")
            }
        }
        arr[0] = p
        arr[1] = c
        result.add(arr)
        return result.toTypedArray()
    }
}