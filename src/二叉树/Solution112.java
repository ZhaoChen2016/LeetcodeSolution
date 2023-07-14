package 二叉树;

/**
 * creat by zhaochen on 2018/6/3 22:55
 */
public class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.right == null && root.left == null)
            return root.val == sum;
        return hasPathSum(root.right,sum-root.val) || hasPathSum(root.left,sum-root.val);
    }
}
