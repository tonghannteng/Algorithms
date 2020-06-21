//  174. Dungeon Game

import java.util.ArrayList;
import java.util.List;

class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        // https://leetcode.com/problems/dungeon-game/discuss/698231/Java-DP-solution-explained.-O(n-m)-time-and-O(m)-space
        int n = dungeon.length;
        int m = dungeon[0].length;
        int[][] dp = new int[n][m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i + 1 == n && j + 1 == m) {
                    dp[i][j] = Math.max(1 - dungeon[i][j], 1);
                    continue;
                }

                if (i + 1 == n) {
                    dp[i][j] = Math.max(dp[i][j + 1] - dungeon[i][j], 1);
                } else if (j + 1 == m) {
                    dp[i][j] = Math.max(dp[i + 1][j] - dungeon[i][j], 1);
                } else {
                    int right = Math.max(dp[i][j + 1] - dungeon[i][j], 1);
                    int down = Math.max(dp[i + 1][j] - dungeon[i][j], 1);
                    dp[i][j] = Math.min(right, down);
                }
            }
        }

        return dp[0][0];
    }
}