package top100;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;
import java.util.Map;

public class Solution169 {
    public static int majorityElement(int[] nums) {
        int mLen = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer i:nums){
            Integer count = map.get(i) == null ? map.put(i,1) : map.put(i,map.get(i)+1);
            count = count == null ? 1: ++count;
            if (count > mLen)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ele = {3,2,3};
        majorityElement(ele);
    }
}
