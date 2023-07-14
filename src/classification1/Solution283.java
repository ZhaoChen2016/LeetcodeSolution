package classification1;

/**
 * creat by zhaochen on 2018/5/7 17:03
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i <= nums.length; i++){
            if (nums[i]!= 0){
                if (i != k){
                    swap(nums,i,k++);
                }else {//遇到0元素的时候指针k就停止 然后和i指的下一个非0元素交换位置
                    k++;
                }
            }
        }

    }

    public void swap(int [] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
