package 二叉树;

/**
 * creat by zhaochen on 2018/6/3 23:19
 */
public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        int total = sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        if (root.left != null && root.left.right == null && root.left.left == null)
            return root.left.val + total;
        else
            return total;


    }

}
