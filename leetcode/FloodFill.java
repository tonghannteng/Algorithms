//  733. Flood Fill

class FloodFill {

    private static final int[] row = {-1, 0, 0, 1};
    private static final int[] col = {0, -1, 1, 0};

    private static boolean isValid(int[][] mat, int oldColor, boolean[][] visited, int row, int col) {
        return (row >= 0) &&
                (row < mat.length) &&
                (col >= 0) &&
                (col < mat[0].length) &&
                (mat[row][col] == oldColor) &&
                (!visited[row][col]);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        Queue<Cell> queue = new LinkedList<>();
        queue.add(new Cell(sr, sc));
        int oldColor = image[sr][sc];
        while (!queue.isEmpty()) {
            Cell cell = queue.remove();
            image[cell.x][cell.y] = newColor;
            visited[cell.x][cell.y] = true;
            for (int i = 0; i < 4; i++) {
                int x = cell.x + row[i];
                int y = cell.y + col[i];
                if (isValid(image, oldColor, visited, x, y)) {
                    queue.add(new Cell(x, y));
                }
            }
        }
        return image;
    }
}

class Cell {
    int x, y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

