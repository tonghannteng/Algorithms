//  1035. Uncrossed Lines

import kotlin.math.max

class XKindDeckCards {
    fun maxUncrossedLines(A: IntArray, B: IntArray): Int {
        val dp = Array(A.size + 1) { IntArray(B.size + 1) }
        for (i in A.indices) {
            for (j in B.indices) {
                if (A[i] == B[j]) {
                    dp[i + 1][j + 1] = 1 + dp[i][j]
                } else {
                    dp[i + 1][j + 1] = max(dp[i + 1][j], dp[i][j + 1])
                }
            }
        }
        return dp[A.size][B.size]
    }
}