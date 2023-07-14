package classification1;

/**
 * creat by zhaochen on 2018/5/7 19:48
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                /*if (i != j)
                    swap(nums,i,j++);
                else
                    j++;*/
                swap(nums,i,j++);
            }
        }

        return j;

    }

    public void swap(int [] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,3,1};

    }
}
