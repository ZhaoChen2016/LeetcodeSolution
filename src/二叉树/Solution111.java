package 二叉树;

/**
 * creat by zhaochen on 2018/5/30 15:42
 */
public class Solution111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int right = minDepth(root.right);
        int left = minDepth(root.left);
        int max = Math.max(right,left);
        int min = Math.min(right,left);//如果有一边是空树 那么高度是另一边的高度 这个是陷阱
        return min == 0 ? (max+1) : (min+1);

    }
}
