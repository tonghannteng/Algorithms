//  322. Coin Change

class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[][] arr = new int[coins.length + 1][amount + 1];
        for (int i = 0; i <= coins.length; i++) {
            arr[i][0] = 0;
        }
        for (int j = 0; j <= amount; j++) {
            arr[0][j] = amount + 1;
        }
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j >= coins[i-1]) {
                    arr[i][j] = Math.min(arr[i][j - coins[i-1]] + 1, arr[i-1][j]);
                } else {
                    arr[i][j] = arr[i-1][j];
                }
            }
        }
        return arr[coins.length][amount] > amount ? -1 : arr[coins.length][amount];
    }
}
