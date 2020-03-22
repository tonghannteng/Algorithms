//  313. super-ugly-number

class SuperUglyNumber {

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] list = new int[n];
        list[0] = 1;
        int[] index = new int[primes.length];
        int[] d = new int[primes.length];
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                d[j] = primes[j] * list[index[j]];
                if (d[j] < min) {
                    min = d[j];
                }
            }
            for (int j = 0; j < d.length; j++) {
                if (d[j] == min) {
                    index[j]++;
                }
            }
            list[i] = min;
        }
        return list[n - 1];
    }
}