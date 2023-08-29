package 二分查找;
/*二分查找的经典写法*/
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left <= right){
            int mid = left + right / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
