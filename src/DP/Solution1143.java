package DP;

public class Solution1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m][n];

        dp[0][0] = text1.charAt(0) == text2.charAt(0) ? 1 : 0;
/*        if (m == 1 || n == 1){
            return dp[0][0];
        }
        dp[0][1] = text1.charAt(0) == text2.charAt(1) ? 1 : dp[0][0];
        dp[1][0] = text1.charAt(1) == text2.charAt(0) ? 1 : dp[0][0];*/


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (text1.charAt(i) == text2.charAt(j)){
                    dp[i][j] = i >= 1 && j >= 1 ? (dp[i - 1][j - 1] + 1) : 1;
                }
                else{
                    if (i >= 1 && j >= 1){
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    } else if (i >= 1){
                        dp[i][j] = dp[i - 1][j];
                    } else if (j >= 1){
                        dp[i][j] = dp[i][j - 1];
                    } else {
                        dp[i][j] = 0;
                    }
                }

            }
        }

        return dp[m - 1][n - 1];
    }
}
