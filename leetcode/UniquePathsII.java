//  63. Unique Paths II

class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        int[][] dp = new int[n][m];

        for (int y = 0; y < m; y++) {
            if (obstacleGrid[0][y] == 1) {
                dp[0][y] = 0;
                break;
            } else {
                dp[0][y] = 1;
            }
        }
        for (int x = 0; x < n; x++) {
            if (obstacleGrid[x][0] == 1) {
                dp[x][0] = 0;
                break;
            } else {
                dp[x][0] = 1;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }
        return dp[n-1][m-1];
    }
}