package 滑动窗口和查找;

import java.util.HashSet;
import java.util.Set;

/**
 * creat by zhaochen on 2018/5/19 14:27
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0;i < nums.length; i++){
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;

    }
}
