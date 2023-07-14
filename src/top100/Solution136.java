package top100;

import java.util.HashMap;
import java.util.Map;

public class Solution136 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer i:nums){
            if (map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        for (Map.Entry entry :map.entrySet()){
            if ((int)entry.getValue()== 1)
                return  (int)entry.getKey();
        }
        return -1;
    }
}
