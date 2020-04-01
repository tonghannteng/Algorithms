//  695. Max Area of Island

class MaxAreaIsland {

    private int[] r = {-1, 0, 0, 1};
    private int[] c = {0, -1, 1, 0};

    private boolean isValid(int[][] grid, boolean[][] visited, int row, int col) {
        return (row >= 0) &&
                (row < grid.length) &&
                (col >= 0) &&
                (col < grid[0].length) &&
                (grid[row][col] == 1) &&
                (!visited[row][col]);
    }

    private int BFS(int[][] grid, int i, int j, boolean[][] visited) {
        Queue<Island> queue = new LinkedList<>();
        queue.add(new Island(i, j));
        int count = 1;
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            Island island = queue.remove();
            int pointX = island.x;
            int pointY = island.y;
            for (int k = 0; k < 4; k++) {
                if (isValid(grid, visited, pointX + r[k], pointY + c[k])) {
                    visited[pointX + r[k]][pointY + c[k]] = true;
                    queue.add(new Island(pointX + r[k], pointY + c[k]));
                    count++;
                }
            }
        }
        return count;
    }

    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0) return 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int count = BFS(grid, i, j, visited);
                    if (count > max) {
                        max = count;
                    }
                }
            }
        }
        return max;
    }
}

class Island {
    int x, y;

    public Island(int x, int y) {
        this.x = x;
        this.y = y;
    }
}