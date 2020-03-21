//  204. count-primes

class CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
        if (n > 2) {
            count = 1;
        }
        for (int i = 1; i < n; i+=2) {
            if (checkIsPrime(i)) count++;
        }
        return count;
    }

    private boolean checkIsPrime(int num) {
        if (num == 2) return true;
        else if (num <= 1 || num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}