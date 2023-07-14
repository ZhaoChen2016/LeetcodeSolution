package DP;

import java.util.Arrays;

/**
 * creat by zhaochen on 2018/6/21 17:05
 */
public class Solution279 {
    public int numSquares(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        for (int i = 1; i <= n; i++) {//2到n 子问题
            for (int j = 1; j * j <= i; j++) {
                memo[i] = Math.min(memo[i], memo[i - j * j] + 1);
            }
        }
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution279().numSquares(2));
    }
}
