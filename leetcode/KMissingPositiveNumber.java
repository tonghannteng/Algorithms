//  1539. Kth Missing Positive Number

class KMissingPositiveNumber {

    public int findKthPositive(int[] arr, int k) {
        for (int j : arr) {
            if (j <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }
}