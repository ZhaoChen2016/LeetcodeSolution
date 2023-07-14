package 递归与回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * creat by zhaochen on 2018/6/10 19:37
 */
public class Solution46 {
    List<List<Integer>> res = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0){
            return res;
        }
        used = new boolean[nums.length];
        generatePermutation(nums,0,new ArrayList());
        return res;
    }

    public void generatePermutation(int[] nums,int index,List p){
        if (index == nums.length){
            res.add(new ArrayList<Integer>(p));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (used[i]){
                continue;
            }
            p.add(nums[i]);
            used[i] = true;
            generatePermutation(nums,index+1,p);
            p.remove((Object) nums[i]);
            used[i] = false;
            }
        return;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        new Solution46().permute(array);
    }
}
