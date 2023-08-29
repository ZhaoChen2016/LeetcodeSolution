package DP;

/**
 * creat by zhaochen on 2018/6/22 15:41
 */
public class Solution198 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int[] memo = new int[n];
        memo[n-1] = nums[n-1];
        for (int i = n-2; i >= 0; i--){
            memo[i] = Math.max(memo[i+1],nums[i]+(i+2 < n?memo[i+2]:0));
        }

        return memo[0];
    }

    public int rob2(int[] nums){
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int[] memo = new int[n];
        for (int i = 2; i<n; i++){
            memo[i] = Math.max(i-2>=0?nums[i] + memo[i-2]:nums[i],i-1>=0?memo[i-1]:0);
        }
        return memo[n-1];

    }

    public int rob3(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        if (n >=2) {
            dp[1] = Math.max(nums[0], nums[1]);
        }
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[n];

    }

    public int rob4(int[] nums) {
        int n = nums.length;
        int[] dp = new int[2];
        dp[0] = nums[0];
        if (n >=2) {
            dp[1] = Math.max(nums[0], nums[1]);
        }
        for (int i = 2; i < n; i++) {
            dp[i % 2] = Math.max(dp[(i - 1) % 2], dp[(i - 2) % 2] + nums[i]);
        }

        return dp[(n-1) % 2];

    }


}