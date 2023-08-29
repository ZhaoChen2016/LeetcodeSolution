package 二分查找;

public class Solution34 {
    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                int start = mid;
                int end = mid;
                while (start >= 0 && nums[start] == target){
                    start --;
                }
                while (end <= nums.length - 1 && nums[end] == target){
                    end ++;
                }
                return new int[]{start + 1, end - 1};
            } else if (target > nums[mid]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        searchRange(new int[]{5,7,7,8,8,10}, 8);
    }
}
