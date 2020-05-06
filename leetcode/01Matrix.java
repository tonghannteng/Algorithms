//  542. 01 Matrix
class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Matrix {

    private static final int[] row = {-1, 0, 0, 1};
    private static final int[] col = {0, -1, 1, 0};

    private static boolean isValid(int[][] mat, int row, int col) {
        return (row >= 0) &&
                (row < mat.length) &&
                (col >= 0) &&
                (col < mat[0].length);
    }

    public int[][] updateMatrix(int[][] matrix) {
        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new Node(i, j));
                } else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            for (int i = 0; i < 4; i++) {
                int x = node.x + row[i];
                int y = node.y + col[i];
                if (isValid(matrix, x, y)) {
                    if (matrix[x][y] <= matrix[node.x][node.y]) {
                        continue;
                    }
                    queue.add(new Node(x, y));
                    matrix[x][y] = matrix[node.x][node.y] +1;
                }
            }
        }
        return matrix;
    }
}