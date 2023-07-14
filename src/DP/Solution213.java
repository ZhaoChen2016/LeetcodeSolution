package DP;

/**
 * creat by zhaochen on 2018/6/22 16:10
 */
public class Solution213 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        return Math.max(rob(nums,0,n-2),rob(nums,1,n-1));
    }

    public int rob(int[] nums,int lo,int hi) {
        int n = hi-lo+1;
        int[] memo = new int[n+1];
        memo[hi] = nums[hi];
        for (int i = hi-1; i >= lo; i--){
            memo[i] = Math.max(memo[i+1],nums[i]+(i+2 <= hi?memo[i+2]:0));
        }

        return memo[lo];
    }
}
