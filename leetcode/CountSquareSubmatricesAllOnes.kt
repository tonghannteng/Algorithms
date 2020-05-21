import kotlin.math.min

fun countSquares(matrix: Array<IntArray>): Int {
    val m = matrix.size
    val n = matrix[0].size
    val dp = Array(m) {IntArray(n)}
    var res = 0
    for (i in 0 until m) {
        for (j in 0 until n) {
            if (i == 0 || j == 0) {
                dp[i][j] = matrix[i][j]
            } else {
                if (matrix[i][j] == 1) {
                    dp[i][j] = min(dp[i-1][j], min(dp[i-1][j-1], dp[i][j-1])) + 1
                } else {
                    dp[i][j] = 0
                }
            }
            res+=dp[i][j]
        }
    }
    return res
}