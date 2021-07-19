//  1572. Matrix Diagonal Sum

class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if (i == j || i + j == mat.length - 1) {
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}