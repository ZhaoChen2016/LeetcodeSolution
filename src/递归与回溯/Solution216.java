package 递归与回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * creat by zhaochen on 2018/6/11 10:40
 */
public class Solution216 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        if (k <= 0 || n <= 1){
            return res;
        }
        findSum(k,n,0,1,new ArrayList());
        return res;
    }
    public void findSum(int k,int remain,int num,int index,List list){
        if (num == k && remain == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i <=9; i++){
            if (list.contains(i) || i > remain){
                continue;
            }
            list.add(i);
            findSum(k,remain-i,num+1,i+1,list);
            list.remove(list.size()-1);
        }
        return;
    }
}
