package classification1;

/**
 * creat by zhaochen on 2018/5/7 23:02
 */
public class Solution80 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++)
            if (i < 2 || nums[j] > nums[i-2])
                //j上的元素和i之前两个位置上的元素比较 由于是有序数组 大于说明是不等的
                // 这就说明j上这个元素是可以放到i这个位置上的 原理很简单
                nums[i++] = nums[j];
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,4,4,5};
        removeDuplicates(nums);
    }

}
