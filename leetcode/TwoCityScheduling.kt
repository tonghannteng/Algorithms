//  1029. Two City Scheduling

class TwoCityScheduling {

    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        var sum = 0
        for (i in costs.indices) {
            sum += costs[i][0]
        }
        var arr = IntArray(costs.size)
        for (i in costs.indices) {
            arr[i] = costs[i][1] - costs[i][0]
        }
        Arrays.sort(arr)
        for (i in 0 until arr.size / 2) {
            sum += arr[i];
        }
        return sum
    }
}