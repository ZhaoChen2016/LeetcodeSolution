package DP;

import java.util.HashMap;
import java.util.Map;

public class Solution873 {
    public static int lenLongestFibSubseq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }
        int[][] dp = new int[n][n];
        int result = 2;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int k = map.getOrDefault(arr[i] - arr[j], -1);
                dp[i][j] = k >= 0 && k < j ? dp[j][k] + 1 : 2;
                result = Math.max(result, dp[i][j]);
            }
        }
        return result > 2 ? result : 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        lenLongestFibSubseq(arr);
    }
}
