//  994. Rotting Oranges

class Orange {
    int x, y;

    public Orange(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class RottingOranges {

    private static boolean isValid(int mat[][], int row, int col) {
        return (row >= 0 && row < mat.length) &&
                (col >= 0 && col < mat[0].length) &&
                (mat[row][col] == 1);
    }

    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int X = grid.length;
        int Y = grid[0].length;
        int fresh_orange = 0;
        Queue<Orange> queue = new LinkedList<>();
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                // 1 fresh orange
                if (grid[i][j] == 1) {
                    fresh_orange++;
                } else if (grid[i][j] == 2) {
                    // rotten orange
                    queue.offer(new Orange(i, j));
                }
            }
        }
        int result = 0;
        int row[] = {-1, 0, 0, 1};
        int column[] = {0, -1, 1, 0};
        if (fresh_orange == 0) return 0;
        while (!queue.isEmpty()) {
            result++;
            int size = queue.size();
            for (int n = 0; n < size; n++) {
                Orange orange = queue.poll();
                for (int k = 0; k < 4; k++) {
                    int xx = orange.x + row[k];
                    int yy = orange.y + column[k];
                    if (isValid(grid, xx, yy)) {
                        queue.offer(new Orange(xx, yy));
                        grid[xx][yy] = 2;
                        fresh_orange--;
                    }
                }
            }

        }
        return fresh_orange == 0 ? result - 1 : -1;
    }
}