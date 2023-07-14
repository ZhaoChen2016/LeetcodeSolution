package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * creat by zhaochen on 2018/6/4 11:20
 */
public class Solution113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        if (root.left == null && root.right == null && root.val == sum){
            List<Integer> lists = new ArrayList<>();
            lists.add(root.val);
            res.add(lists);
        }
        List<List<Integer>> left = pathSum(root.left,sum-root.val);
            for (List<Integer> list : left)
                list.add(0,root.val);


        List<List<Integer>> right = pathSum(root.right,sum-root.val);
            for (List<Integer> list : right)
                list.add(0,root.val);
        res.addAll(left);
        res.addAll(right);
        return res;
    }
    /*public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(res, list, root, sum);
        return res;
    }
    private void helper(List<List<Integer>> res, List<Integer> list, TreeNode root, int sum) {
        if (root == null) return;
        list.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            res.add(new ArrayList<>(list));
        }
        helper(res, list, root.left, sum - root.val);
        helper(res, list, root.right, sum - root.val);
        list.remove(list.size() - 1);
    }*/
}

