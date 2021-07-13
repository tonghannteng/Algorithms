//  1716. Calculate Money in Leetcode Bank

class CalculateMoneyLeetcodeBank {

    public int totalMoney(int n) {
        int result = 0;
        int[] arr = {1,2,3,4,5,6,7};
        for(int i = 1; i <= n; i++) {
            result+=(arr[(i-1)%7] + ((i-1)/7));
        }
        return result;
    }
}