package DP;

public class Solution132 {
    public int minCut(String s) {
        int n = s.length();
        Boolean[][] enable = new Boolean[n][n];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && ( j + 1 >= i || enable[i - 1][j + 1] == true)){
                    enable[i][j] = true;
                } else {
                    enable[i][j] = false;
                }
            }
        }

        int[] dp = new int[n];
        for (int i = 0; i < s.length(); i++) {
            if (enable[0][i] == true){
                dp[i] = 0;
            }
            else {
                dp[i] = i;
                for (int j = 1; j < i; j++) {
                    if (enable[j][i]) {
                        dp[i] = Math.min(dp[i], dp[j - 1] + 1);
                    }
                }
            }
        }
       return dp[n - 1];

    }
}
