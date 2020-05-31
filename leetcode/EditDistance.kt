//  72. Edit Distance

import kotlin.math.min

class EditDistance {
    fun minDistance(word1: String, word2: String): Int {
        val dp = Array(word1.length + 1) { IntArray(word2.length + 1) }
        for (i in 0..word1.length) {
            dp[i][0] = i
        }
        for (i in 0..word2.length) {
            dp[0][i] = i
        }
        for (i in word1.indices) {
            for (j in word2.indices) {
                val c1 = word1[i]
                val c2 = word2[j]
                if (c1 == c2) {
                    dp[i + 1][j + 1] = dp[i][j]
                } else {
                    dp[i + 1][j + 1] = min(min(dp[i][j], dp[i + 1][j]), dp[i][j + 1]) + 1
                }
            }
        }
        return dp[word1.length][word2.length]
    }
}