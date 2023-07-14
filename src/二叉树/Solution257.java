package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * creat by zhaochen on 2018/6/4 11:09
 */
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null)
            return res;
        if (root.left == null && root.right == null){
            res.add(Integer.toString(root.val));
        }
        List<String> left = binaryTreePaths(root.left);
        for (String s : left)
            res.add(Integer.toString(root.val)+"->"+s);

        List<String> right = binaryTreePaths(root.right);
        for (String s : right)
            res.add(Integer.toString(root.val)+"->"+s);
        return res;


    }
}
