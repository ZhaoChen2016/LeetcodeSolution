package 递归与回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * creat by zhaochen on 2018/6/10 23:41
 */
public class Solution77 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if (n < 0 || k < 0 || n < k){
            return res;
        }
        List<Integer> list = new ArrayList<>();
        generateCombinations(n,k,1,new ArrayList());
        return res;
    }

    public void generateCombinations(int n,int k,int index,List list){
        if (list.size() == k){
            res.add(new ArrayList<>(list));
            return;
        }
        //还有k-list.size个空位，[i...n]中至少要有k-list.size个元素
        //i最多为n-(k-list.size())+1
        for (int i = index; i <= n-(k-list.size())+1; i++){
            list.add(i);
            generateCombinations(n,k,index+1,list);
            list.remove((Object)i);
        }
        return;
    }
}
