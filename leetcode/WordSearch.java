//  79. Word Search

class WordSearch {

    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, 1, visited)) return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index, boolean[][] visited) {
        visited[i][j] = true;
        int[] r = {-1, 0, 0, 1};
        int[] c = {0, 1, -1, 0};
        if (index == word.length()) return true;
        for (int k = 0; k < 4; k++) {
            int row = i + r[k];
            int col = j + c[k];
            if (row < 0 || row >= board.length) continue;
            if (col < 0 || col >= board[0].length) continue;
            if (visited[row][col]) continue;
            if (board[row][col] == word.charAt(index)) {
                if (dfs(board, word, row, col, index + 1, visited)) return true;
            }
        }
        visited[i][j] = false;
        return false;
    }
}