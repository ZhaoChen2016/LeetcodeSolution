package 递归与回溯;

import java.util.*;

/**
 * creat by zhaochen on 2018/6/10 20:10
 */
public class Solution47 {
    List<List<Integer>> res = new ArrayList<>();
    boolean [] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length == 0 || nums == null){
            return res;
        }
        used = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        generatePermutation(nums,0,list);
        return res;
    }

    public void generatePermutation(int[] nums,int index,List list){
        if (index == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        Set set = new HashSet();
        for (int i = 0; i < nums.length;i++){
            if (!used[i] && set.add(nums[i])) {
                used[i] = true;
                list.add(nums[i]);
                generatePermutation(nums, index + 1, list);
                used[i] = false;
                list.remove(list.size() - 1);
            }
            }
        }




    private static void printList(List<Integer> list){
        for(Integer e: list){
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {2,2,1,1};
        List<List<Integer>> res = new Solution47().permuteUnique(array);
        System.out.println(res);
        for(List<Integer> list: res){
            printList(list);
        }

    }
}
