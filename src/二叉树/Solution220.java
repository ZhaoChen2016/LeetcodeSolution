package 二叉树;

import java.util.TreeSet;

public class Solution220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Long less = set.floor((long) nums[i]);
            if (less != null && nums[i] - less <= valueDiff){
                return true;
            }
            Long greater = set.ceiling((long) nums[i]);
            if (greater != null && greater - nums[i] <= valueDiff){
                return true;
            }
            if (set.size() + 1 > indexDiff){
                set.remove((long) nums[i - indexDiff]);
            }
            set.add((long) nums[i]);
        }
        return false;
    }
}
