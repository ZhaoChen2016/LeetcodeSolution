package 查找.和为XX;

import java.util.HashMap;
import java.util.Map;

/**
 * creat by zhaochen on 2018/4/3 22:53
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        /*

        HashMap<Integer,Integer> maps = new HashMap<>();
        int[] ints = new int[2];
        for (int i = 0;i < nums.length; i++)
            maps.put(nums[i],i);
        for (int i = 0;i < nums.length; i++){
            int searched =  target - nums[i];
            if (maps.keySet().contains(searched) && maps.get(searched) != i){
                ints[0] = i;
                ints[1] = maps.get(target - nums[i]);
            }

        }
        return ints;*/

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i + 1);
        }
        return result;
    }
}
