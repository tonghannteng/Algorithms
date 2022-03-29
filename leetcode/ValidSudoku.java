//  36. Valid Sudoku

class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        int[][] row = new int[N][N];
        int[][] col = new int[N][N];
        int[][] cross = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (board[i][j] == '.') continue;

                int currentIndex = board[i][j] - '1';

                if (row[i][currentIndex] == 1) {
                    return false;
                }
                row[i][currentIndex] = 1; // marked as 1 or visited

                if (col[j][currentIndex] == 1) {
                    return false;
                }
                col[j][currentIndex] = 1; // marked as 1 or visited

                int newRow = (i / 3) * 3 + (j /3);
                if (cross[newRow][currentIndex] == 1) {
                    return false;
                }
                cross[newRow][currentIndex] = 1;
            }
        }
        return true;
    }
}