package 数组;

public class Solution724 {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int sum = 0;
        for (int num : nums){
            total += num;
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (total - sum == sum - nums[i])
                return i;
        }
        return -1;
    }
}
