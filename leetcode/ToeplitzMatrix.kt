//  766. Toeplitz Matrix

class ToeplitzMatrix {

    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        for (i in 0 until matrix.size - 1) {
            for (j in 0 until matrix[0].size - 1) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false
                }
            }
        }
        return true
    }
}