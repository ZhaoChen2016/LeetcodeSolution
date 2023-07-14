package DP;

/**
 * creat by zhaochen on 2018/6/21 16:41
 */
public class Solution343 {
    public int integerBreak(int n) {
        if ( n == 1 ){
            return 1;
        }
        int[] memo = new int[n+1];
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {//从2到n分步的值
            for (int j = 1; j < i - 1; j++) {//j和i-j之间的最大值
                memo[i] = Math.max(Math.max(j * (i - j), memo[j] * (i - j)), memo[i]);
            }
        }
        return memo[n];

    }
}
