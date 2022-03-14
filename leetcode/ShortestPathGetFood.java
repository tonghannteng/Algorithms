//  1730. Shortest Path to Get Food

class ShortestPathGetFood {

    private static final int[] row = {-1, 0, 0, 1};
    private static final int[] col = {0, -1, 1, 0};

    private static boolean isValid(char[][] grid, int row, int col, boolean [][] visited) {
        return (row >= 0) &&
                (row < grid.length) &&
                (col >= 0) &&
                (col < grid[0].length) &&
                (grid[row][col] == 'O' || grid[row][col] == '#') &&
                (!visited[row][col]);
    }

    public int getFood(char[][] grid) {
        int startX = 0, startY = 0;
        int endX = -1, endY = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '*') {
                    startX = i;
                    startY = j;
                }
                if (grid[i][j] == '#') {
                    endX = i;
                    endY = j;
                }
            }
        }
        if (startX == endX && startY == endY) return -1;

        return calculateDistance(grid, startX, startY, endX, endY);

    }

    private int calculateDistance(char[][] grid, int startX, int startY, int endX, int endY) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(startX, startY, 0));
        visited[startX][startY] = true;
        int min_distance = -1;
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            startX = currentNode.x;
            startY = currentNode.y;
            int distance = currentNode.distance;
            System.out.println(grid[startX][startY]);
            if (grid[startX][startY] == '#') {
                min_distance = distance;
                break;
            }

            for (int k = 0; k < 4; k++) {
                int n = startX + row[k];
                int m = startY + col[k];
                if (isValid(grid, n, m, visited)) {
                    // grid[n][m] = 'X';
                    visited[n][m] = true;
                    queue.add(new Node(n, m, distance + 1));
                }
            }
        }
        return min_distance;
    }
}

class Node {
    int x, y, distance;
    Node(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}