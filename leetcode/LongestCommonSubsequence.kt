//  1143. Longest Common Subsequence

class LongestCommonSubsequence {

    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val grid = Array(text1.length + 1) { IntArray(text2.length + 1) }
        var max = 0
        for (i in text1.indices) {
            for (j in text2.indices) {
                if (text1[i] == text2[j]) {
                    grid[i+1][j+1] = grid[i][j] + 1
                } else {
                    grid[i+1][j+1] = grid[i][j + 1].coerceAtLeast(grid[i + 1][j])
                }
                max = max.coerceAtLeast(grid[i+1][j+1])
            }
        }
        return max
    }
}