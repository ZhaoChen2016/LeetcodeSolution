package top100.array;

public class Solution283 {
    public static void moveZeroes(int[] nums) {
        if (nums.length <= 1){
            return;
        }
        for (int i = 0,j = 0; i < nums.length && j < nums.length;) {
            if (nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,4,0,0,3,0,5,1,0};
        moveZeroes(arr);
    }
}
