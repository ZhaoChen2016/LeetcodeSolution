package DP;
//边界问题如何确定？ 退化成单序列问题
public class Solution97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        int p = s3.length();
        if (m + n != p)
            return false;

        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;

        for (int i = 0; i < m; i++) {
            dp[i + 1][0] = dp[i][0] && s1.charAt(i) == s3.charAt(i);
        }

        for (int i = 0; i < n; i++) {
            dp[0][i + 1] = dp[0][i] && s2.charAt(i) == s3.charAt(i);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(j);
                char ch3 = s3.charAt(i + j + 1);
                if (ch1 == ch2 && ch1 == ch3){
                    dp[i + 1][j + 1] = dp[i][j + 1] || dp[i + 1][j];
                } else if (ch1 == ch2){
                    dp[i + 1][j + 1] = dp[i][j + 1];
                } else if (ch1 == ch3){
                    dp[i + 1][j + 1] = dp[i + 1][j];
                } else {
                    dp[i + 1][j + 1] = false;
                }
            }
        }
        return dp[m][n];
    }
}
