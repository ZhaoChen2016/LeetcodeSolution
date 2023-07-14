package 查找;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * creat by zhaochen on 2018/5/16 15:11
 */
public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        for (int i:nums1){
            set.add(i);
        }
        Set<Integer> inter =  new HashSet();
        for (int i:nums2){
            if (set.contains(i))
                inter.add(i);
        }
        int[] res = new int[inter.size()];
        int index = 0;
        for (int i:inter){
            res[index++] = i;
        }
        return res;

    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = (new Solution349()).intersection(nums1, nums2);
    }
}
