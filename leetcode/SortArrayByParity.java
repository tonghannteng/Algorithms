//  905. Sort Array By Parity

class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int j = A.length;
        int k = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[k] = A[i];
                k++;
            } else {
                result[j - 1] = A[i];
                j--;
            }
        }
        return result;
    }
}