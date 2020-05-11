//  1252. Cells with Odd Values in a Matrix

class CellsOddValuesMatrix {

    public int oddCells(int n, int m, int[][] indices) {
        int[][] result = new int[n][m];
        int count = 0;
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            for (int j = 0; j < n; j++) {
                result[j][col]++;
            }
            for (int j = 0; j < m; j++) {
                result[row][j]++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if (result[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}