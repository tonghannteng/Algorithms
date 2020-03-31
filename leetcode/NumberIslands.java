//  200. Number of Islands

class NumberIslands {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    DFS(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    boolean isSafe(char[][] grid, int row, int col, boolean[][] visited) {
        return (row >= 0) &&
                (row < grid.length) &&
                (col >= 0) &&
                (col < grid[0].length) &&
                (grid[row][col] == '1') &&
                !visited[row][col];
    }

    void DFS(char[][] grid, int row, int col, boolean[][] visited) {
        int[] r = {-1, 0, 0, 1};
        int[] c = {0, -1, 1, 0};

        // Mark as visited
        visited[row][col] = true;
        for (int i = 0; i < r.length; i++) {
            if (isSafe(grid, row + r[i], col + c[i], visited)) {
                DFS(grid, row + r[i], col + c[i], visited);
            }
        }
    }
}