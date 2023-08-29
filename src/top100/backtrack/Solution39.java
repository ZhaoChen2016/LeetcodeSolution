package top100.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Solution39 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0)
            return result;
        findSum(candidates, target, 0, new ArrayList<>());
        return result;
    }

    public void findSum(int[] candidates, int target, int index, List<Integer> list){
        if (index == candidates.length)
            return;
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        findSum(candidates, target, index + 1, list);

        if (candidates[index] <= target) {
            list.add(candidates[index]);
            findSum(candidates, target - candidates[index], index, list);
            list.remove(list.size() - 1);
        }

    }
}
