//  985. Sum of Even Numbers After Queries

class SumEvenNumbersAfterQueries {

    fun sumEvenAfterQueries(A: IntArray, queries: Array<IntArray>): IntArray {
        val result = IntArray(queries.size)
        for (i in queries.indices) {
            A[queries[i][1]] = queries[i][0] + A[queries[i][1]]
            result[i] = sumEven(A)
        }
        return result
    }

    fun sumEven(arr: IntArray): Int {
        var sum = 0
        for (n in arr) {
            if (n % 2 == 0) {
                sum += n;
            }
        }
        return sum
    }
}