package classification2;

/**
 * creat by zhaochen on 2018/5/8 15:58
 * 三路快排
 */
public class Solution75 {
    public void sortColors(int[] nums) {
        int zero = -1;
        int two = nums.length;
        for (int i = 0; i < two;){
            if (nums[i] ==1 )
                i++;
            else if (nums[i] == 2)
                swap(nums,i,--two);
            else{
                assert nums[i] == 0;
                swap(nums,++zero,i++);
            }

        }
    }

    public void swap(int [] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
