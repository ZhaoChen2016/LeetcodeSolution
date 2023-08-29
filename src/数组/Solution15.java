package 数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length) {
            int num = nums[i];
            twoSum(i, nums);
            while (i < nums.length && nums[i] == num){
                i++;
            }
        }
        return result;
    }

    public static void twoSum(int i, int[] nums){
        int j = i + 1;
        int k = nums.length - 1;
        while (j < k){
            if (nums[i] + nums[j] + nums[k] == 0){
                result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                int num =  nums[j];
                while (num == nums[j] && j < k){
                    j++;
                }
                return;
            }
            else if (nums[i] + nums[j] + nums[k] > 0){
                k--;
            }
            else {
                j++;
            }
        }
        return;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-1,0,1,2,-1,-4});
    }


}
