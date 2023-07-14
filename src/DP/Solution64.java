package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * creat by zhaochen on 2018/6/19 20:21
 */
public class Solution64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i=1;i<n;i++){
            grid[0][i] += grid[0][i-1];
        }
        for(int i=1;i<m;i++){
            grid[i][0] += grid[i-1][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }

    public static void main(String[] args) {
        List<List<Integer>> t = new ArrayList<>();
        Integer[] array1 = {4,1,8,3};
        Integer[] array2 = {6,5,7,0};
        Integer[] array3 = {3,4,6,0};
        Integer[] array4 = {2,3,4,6};
        t.add(0,new ArrayList<>(Arrays.asList(array1)));
        t.add(0,new ArrayList<>(Arrays.asList(array2)));
        t.add(0,new ArrayList<>(Arrays.asList(array3)));
        t.add(0,new ArrayList<>(Arrays.asList(array4)));
        new Solution120().minimumTotal(t);
    }
}
