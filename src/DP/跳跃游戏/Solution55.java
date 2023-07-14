package DP.跳跃游戏;

/**
 * creat by zhaochen on 2018/8/12 17:06
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i <= nums.length; i++){
            if (reach < i)
                return false;
            reach = Math.max(reach,i+nums[i]);
        }

        return true;

    }
}
