//  286. Walls and Gates

class WallsGates {

    public void wallsAndGates(int[][] rooms) {
        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                if (rooms[i][j] == 0) {
                    queue.add(new Node(i, j));
                }
            }
        }
        int count = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                for (int k = 0; k < r.length; k++) {
                    int rr = current.x + r[k];
                    int cc = current.y + c[k];
                    if (isSafe(rooms, rr, cc)) {
                        rooms[rr][cc] = count;
                        queue.add(new Node(rr, cc));
                    }
                }
            }
            count++;
        }
    }

    private int[] r = {-1, 0, 0, 1};
    private int[] c = {0, 1, -1, 0};

    private boolean isSafe(int[][] grid, int x, int y) {
        return (x >= 0) &&
                (x < grid.length) &&
                (y >= 0) &&
                (y < grid[0].length) &&
                (grid[x][y] == Integer.MAX_VALUE);
    }
}
class Node {
    int x, y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}