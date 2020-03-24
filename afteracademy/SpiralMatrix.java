//  8. Spiral Matrix

class SpiralMatrix {

    public int[] spiralMatrix(int[][] arr) {
        // write your awesome code here
        int[] result = new int[arr.length * arr[0].length];
        int index = 0;
        int top = 0;
        int right = arr[0].length - 1; //   4 -1 = 3
        int down = arr.length - 1; // 3 - 1 = 2
        int left = 0;
        while (index < result.length) {
            for (int i = 0; i < arr[0].length; i++) {
                if (isValid(arr, top, i)) {
                    result[index] = arr[top][i];
                    arr[top][i] = 0;
                    index++;
                }
            }
            top++;
            for (int i = 0; i < arr.length; i++) {
                if (isValid(arr, i, right)) {
                    result[index] = arr[i][right];
                    arr[i][right] = 0;
                    index++;
                }
            }
            right--;
            for (int i = arr[0].length - 1; i >= 0; i--) {
                if (isValid(arr, down, i)) {
                    result[index] = arr[down][i];
                    arr[down][i] = 0;
                    index++;
                }
            }
            down--;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (isValid(arr, i, left)) {
                    result[index] = arr[i][left];
                    arr[i][left] = 0;
                    index++;
                }
            }
            left++;
        }
        return result;
    }

    private boolean isValid(int[][] arr, int row, int col) {
        return (row >= 0) &&
                (row < arr.length) &&
                (col >= 0) &&
                (col < arr[0].length) &&
                arr[row][col] != 0;
    }

}