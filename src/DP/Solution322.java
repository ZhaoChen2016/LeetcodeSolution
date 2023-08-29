package DP;

import java.util.Arrays;

public class Solution322 {
    public static int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i = 0; i < coins.length + 1; i++) {
            Arrays.fill(dp[i], amount + 1);
            dp[i][0] = 0;
        }

        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                for (int k = 0; k * coins[i - 1] <= j ; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - k * coins[i - 1]] + k);
                }
            }
        }

        return dp[coins.length][amount] > amount ?  -1 : dp[coins.length][amount];
    }

    public static void main(String[] args) {
        coinChange(new int[]{1, 2, 5}, 11);
    }
}
