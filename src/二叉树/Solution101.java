package 二叉树;

import sun.reflect.generics.tree.Tree;

/**
 * creat by zhaochen on 2018/5/30 16:19
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root){
        if (root == null)
            return true;
        return isSymmetric(root.right,root.left);
    }

    public boolean isSymmetric(TreeNode right,TreeNode left){
        if (right == null || left == null)
            return right == left;
        if (right.val != left.val)
            return false;
        return isSymmetric(right.right,left.left) && isSymmetric(right.left,left.right);
    }

}
