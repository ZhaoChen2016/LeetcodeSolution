package DP;
//从第i个台阶往上爬
public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        int dp[] = new int[size];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < size; i++) {
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
        }
        return Math.min(dp[size - 1], dp[size - 2]);
    }
}
