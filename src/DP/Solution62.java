package DP;

import java.util.Arrays;

/**
 * creat by zhaochen on 2018/6/22 10:06
 */
public class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        int[] filled = new int[n];
        Arrays.fill(filled,1);
        Arrays.fill(matrix,filled);
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
            }
        }

        return matrix[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(new Solution62().uniquePaths(3,2));
    }
}
