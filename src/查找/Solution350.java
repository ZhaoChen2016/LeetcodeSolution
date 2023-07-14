package 查找;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * creat by zhaochen on 2018/5/16 15:48
 */
public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> maps = new HashMap<>();
        for (int i:nums1){
            if (maps.containsKey(i))
                maps.put(i,maps.get(i)+1);
            else
                maps.put(i,1);
        }
        List<Integer> lists = new ArrayList<>();
        for (int i:nums2){
            if (maps.containsKey(i) && maps.get(i)!=0){
                lists.add(i);
                maps.put(i,maps.get(i)-1);
            }
        }
        int[] res = new int[lists.size()];
        int index = 0;
        for (int i:lists)
            res[index++] = i;

        return res;
    }
}
