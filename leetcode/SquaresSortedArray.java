//  977. Squares of a Sorted Array

class SquaresSortedArray {

    public int[] sortedSquares(int[] A) {
        int m = 0;
        int n = A.length - 1;
        int arr[] = new int[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            if (Math.abs(A[m]) < Math.abs(A[n])) {
                arr[i] = Math.abs(A[n]) * Math.abs(A[n]);
                n--;
            } else {
                arr[i] = Math.abs(A[m]) * Math.abs(A[m]);
                m++;
            }
        }
        return arr;
    }
}