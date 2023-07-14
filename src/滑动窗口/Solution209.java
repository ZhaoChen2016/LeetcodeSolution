package 滑动窗口;

/**
 * creat by zhaochen on 2018/5/13 17:01
 */
public class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int j = -1;//[i,j]为滑动窗口
        int sum = 0;
        int res = nums.length+1;
        while (i < nums.length){
            //应该是左边的边界小于数组长度 右边边界等于数组长度的情况还有可能左边边界可以再移动
            //理解成左边边界一直在往右边移动
            if (sum < s && j+1 < nums.length)
                sum = sum + nums[++j];
            else
                sum = sum - nums[i++];

            if (sum >= s)
                res = Math.min(res,j-i+1);
        }

        return (res == nums.length+1) ? 0 : res;

    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;
        System.out.println((new Solution209()).minSubArrayLen(s, nums));
    }

}
