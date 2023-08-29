package DP;

public class Solution115 {
    public static int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            dp[i + 1][0] = 1;
            for (int j = 0; j <= i && j < n; j++) {
                if (s.charAt(i) == t.charAt(j)){
                    dp[i + 1][j + 1] = dp[i][j] + dp[i][j + 1];
                } else {
                    dp[i + 1][j + 1] = dp[i][j + 1];
                }
            }
        }

        return dp[m][n];

    }

    public static void main(String[] args) {
        numDistinct("rabbbit", "rabbit");
    }
}
