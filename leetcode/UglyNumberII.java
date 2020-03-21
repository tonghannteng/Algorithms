//  264. ugly number II

class UglyNumberII {

    public int nthUglyNumber(int n) {
        if (n == 0) return 0;
        int[] arr = new int[n];
        arr[0] = 1;
        int k = 0;
        int p = 0;
        int q = 0;
        for (int i = 1; i < n; i++) {
            int kk = 2 * arr[k]; // 8
            int pp = 3 * arr[p]; // 6
            int qq = 5 * arr[q]; // 5
            int min = Math.min(kk, Math.min(pp, qq));
            if (min == kk) {
                k++;
            }
            if (min == pp) {
                p++;
            }
            if (min == qq) {
                q++;
            }
            arr[i] = min;
        }
        return arr[n - 1];
    }
}