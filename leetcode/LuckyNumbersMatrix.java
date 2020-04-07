//  1380. Lucky Numbers in a Matrix

class LuckyNumbersMatrix {

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            temp.add(min);
        }
        for (int i = 0; i < col; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < row; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            if (temp.contains(max)) {
                result.add(max);
            } else {
                temp.add(max);
            }
        }
        return result;
    }
}