package 递归与回溯;

import java.lang.reflect.Array;
import java.util.*;

/**
 * creat by zhaochen on 2018/6/11 11:09
 */
public class Solution90 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null || nums.length == 0){
            return res;
        }
        Arrays.sort(nums);
        findSub(nums,new ArrayList(),0);
        return res;
    }
    public void findSub(int[] nums,List list,int index){
        res.add(new ArrayList<>(list));
        Set set = new HashSet();
        for (int i = index; i < nums.length; i++){
            if (!set.add(nums[i])){
                continue;
            }
            list.add(nums[i]);
            findSub(nums,list,i+1);
            list.remove(list.size()-1);
        }
        return;
    }
}
