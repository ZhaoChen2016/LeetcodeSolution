package 递归与回溯;

import java.util.*;

/**
 * creat by zhaochen on 2018/6/11 0:16
 */
public class Solution40 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0){
            return res;
        }
        Arrays.sort(candidates);
        findSum(candidates,target,0,new ArrayList());
        return res;
    }
    /*public void findSum(int[] nums,int remain,int index,List list){
        if (remain == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < nums.length; i++){
            if (i > index && nums[i] == nums[i-1])
                continue;
            //不能出现重复的组合 首先保证本次递归中不会把重复元素放在同一个位置 第二次递归重复元素后面的一个不会被访问到
            if (nums[i] <= remain){
                list.add(nums[i]);
                findSum(nums,remain-nums[i],i+1,list);
                list.remove(list.size()-1);
            }
        }
        return;
    }*/


    public void findSum(int[] nums,int remain,int index,List list){
        if (remain == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        Set set = new HashSet();
        for (int i = index; i < nums.length; i++){
            if (!set.add(nums[i])){
                continue;
            }
            //不能出现重复的组合 首先保证本次递归中不会把重复元素放在同一个位置 第二次递归重复元素后面的一个不会被访问到
            if (nums[i] <= remain){
                list.add(nums[i]);
                findSum(nums,remain-nums[i],i+1,list);
                list.remove(list.size()-1);
            }
        }
        return;
    }
    private static void printList(List<Integer> list){
        for(Integer e: list){
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1,7,1};
        List<List<Integer>> res = new Solution40().combinationSum2(a,8);
        for(List<Integer> list: res){
            printList(list);
        }
    }
}
