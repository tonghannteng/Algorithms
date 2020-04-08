//  1304. Find N Unique Integers Sum up to Zero

class FindNUniqueIntegersSumUpZero {

    public int[] sumZero(int n) {
        int[] result = new int[n];
        if (n == 1) return result;
        for (int i = 0; i <= n - 2; i += 2) {
            result[i] = (i + 1);
            result[i + 1] = (i + 1) * (-1);
        }
        if (n % 2 != 0) {
            result[n - 1] = 0;
        }
        return result;
    }
}