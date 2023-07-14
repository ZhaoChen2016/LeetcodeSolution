package 递归与回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * creat by zhaochen on 2018/6/10 23:59
 */
public class Solution39 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0){
            return res;
        }
        findSum(candidates,target,0,new ArrayList());
        return res;
    }
    public void findSum(int[] nums,int remain,int index,List list){
        if (remain == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < nums.length; i++){
            if (nums[i] <= remain){
                list.add(nums[i]);
                findSum(nums,remain-nums[i],i,list);//这里index是因为前面的组合都已经用过了 i这个位置可能有重复的所以不加1
                list.remove(list.size()-1);
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] candidates = new int[]{2, 3, 6, 7};
        new Solution39().combinationSum(candidates,7);
    }
}
