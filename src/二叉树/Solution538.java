package 二叉树;

public class Solution538 {
    int sum;
    public TreeNode convertBST(TreeNode root) {
        if (root == null)
            return null;
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }
}
