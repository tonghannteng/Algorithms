//  2133. Check if Every Row and Column Contains All Numbers

class CheckEveryRowColumnContainsAllNumbers {

    public boolean checkValid(int[][] matrix) {

        int[][] row = new int[matrix.length][matrix.length];
        int[][] col = new int[matrix.length][matrix.length];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                int currentIndex = matrix[r][c] - 1;

                if (row[r][currentIndex] == 1) {
                    return false;
                }
                row[r][currentIndex] = 1;

                if (col[c][currentIndex] == 1) {
                    return false;
                }
                col[c][currentIndex] = 1;
            }
        }
        return true;
    }
}