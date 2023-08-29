package 二分查找;

public class Solution540 {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = (nums.length - 1) / 2;
        while (left <= right){
            int mid = (left + right) / 2;
            if (mid * 2 + 1 <= nums.length - 1 && nums[mid * 2] != nums[mid * 2 + 1]){
                if (mid == 0 || nums[mid * 2 - 1] == nums[mid * 2 - 2])
                    return nums[mid * 2];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return nums[nums.length - 1];
    }
}
