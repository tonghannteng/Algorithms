//  54. piral-matrix

class SpiralMatrix {
    public boolean valid(boolean[][] check, int row, int column) {
        return row >= 0 &&
                row < check.length &&
                column >= 0 &&
                column < check[0].length &&
                !check[row][column];
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;
        int count = 0;
        int right = matrix[0].length - 1;
        int left = 0;
        int top = matrix.length - 1;
        int down = 0;
        int c = matrix[0].length;
        int r = matrix.length;
        boolean[][] check = new boolean[r][c];
        while (count < c*r) {
            for (int i = 0; i < c; i++) {
                if (valid(check, left, i)) {
                    result.add(matrix[left][i]);
                    check[left][i] = true;
                    count++;
                }
            }
            left++;
            for (int i = 0; i < r; i++) {
                if (valid(check, i, right)) {
                    result.add(matrix[i][right]);
                    check[i][right] = true;
                    count++;
                }
            }
            right--;
            for (int i = c - 1; i >= 0; i--) {
                if (valid(check, top, i)) {
                    result.add(matrix[top][i]);
                    check[top][i] = true;
                    count++;
                }
            }
            top--;
            for (int i = r - 1; i >= 0; i--) {
                if (valid(check, i, down)) {
                    result.add(matrix[i][down]);
                    check[i][down] = true;
                    count++;
                }
            }
            down++;
        }
        return result;
    }
}