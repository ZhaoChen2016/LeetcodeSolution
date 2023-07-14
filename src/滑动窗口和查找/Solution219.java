package 滑动窗口和查找;

import java.util.HashSet;
import java.util.Set;

/**
 * creat by zhaochen on 2018/5/19 14:13
 * 特点是固定滑动窗口 和之前滑动窗口的区别
 * 查找里面有没有这个元素 不需要在意索引的情况下 使用set O(1)事件复杂度
 */
public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> sets = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (sets.contains(nums[i]))
                return true;
            sets.add(nums[i]);
            if (sets.size() == k+1)
                sets.remove(nums[i-1]);
        }

        return false;

    }
}
