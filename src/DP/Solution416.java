package DP;

public class Solution416 {
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        if (sum % 2 == 1){
            return false;
        }
        int target = sum/2;
        boolean[][] dp = new boolean[nums.length + 1][target + 1];
        for (int i = 0; i <= nums.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= nums[i - 1] && !dp[i][j]) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[nums.length][target];

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        canPartition(nums);
    }
}
