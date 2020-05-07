//  73. Set Matrix Zeroes

class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new Node(i, j));
                }
            }
        }
        for (Node node : list) {
            int x = node.x;
            int y = node.y;
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[x][j] = 0;
            }
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][y] = 0;
            }
        }
    }
}

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}