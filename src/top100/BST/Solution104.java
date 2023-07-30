package top100.BST;

public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.right);
        int right = maxDepth(root.left);
        return 1 + ((left > right) ? left : right);
    }
}
