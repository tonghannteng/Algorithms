//  1688. Count of Matches in Tournament

class CountMatchesTournament {

    public int numberOfMatches(int n) {
        int sum = 0;
        int mod = 0;
        while(n > 1) {
            mod = n%2;
            n = n/2;
            sum+=n;
            n = n + mod;
        }
        return sum;
    }
}