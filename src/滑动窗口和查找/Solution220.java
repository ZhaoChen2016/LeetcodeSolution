package 滑动窗口和查找;

import java.util.TreeSet;

/**
 * creat by zhaochen on 2018/5/19 14:44
 */
public class Solution220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++){
            if (set.ceiling((long)nums[i]-(long) t)!=null &&
                    set.ceiling((long)nums[i]-(long) t) <= (long)nums[i] + (long)t) {
                return true;
            }
            set.add((long)nums[i]);
            if (set.size() == k+1) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;

    }
}
