package DP;

public class Solution256 {
    public int minCost(int[][] costs) {
        int length = costs.length;
        int[][] dp = new int[length][3];
        for (int i = 0; i < 3; i++) {
            dp[0][i] = costs[0][i];
        }
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = Math.min(dp[i-1][(j+1) % 3],dp[i-1][(j+2) % 3]) + costs[i][j];
            }
        }

        return Math.min(Math.min(dp[length - 1][0], dp[length - 1][1]), dp[length - 1][2]);
    }
}
