package 递归与回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * creat by zhaochen on 2018/6/11 10:57
 */
public class Solution78 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0){
            return res;
        }
        findSub(nums,new ArrayList(),0);
        return res;
    }
    public void findSub(int[] nums,List list,int index){
        res.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++){
            list.add(nums[i]);
            findSub(nums,list,i+1);
            list.remove(list.size()-1);
        }
        return;
    }
}
