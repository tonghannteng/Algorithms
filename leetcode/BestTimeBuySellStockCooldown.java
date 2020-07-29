//  309. Best Time to Buy and Sell Stock with Cooldown

class BestTimeBuySellStockCooldown {

    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        if (prices.length <= 1) return 0;
        int maxInc = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (i > 0) {
                dp[i] = Math.max(0, Math.max(dp[i - 1], prices[i] + maxInc));
            }
            int prevIncome = (i > 2) ? dp[i - 2] : 0;
            if (prevIncome - prices[i] > maxInc) maxInc = prevIncome - prices[i];
        }
        return dp[prices.length - 1];
    }
}

