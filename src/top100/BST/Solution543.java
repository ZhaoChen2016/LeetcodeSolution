package top100.BST;

public class Solution543 {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTreeRecursive(root);
        return max - 1;
    }

    public int diameterOfBinaryTreeRecursive(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = diameterOfBinaryTreeRecursive(node.left);
        int right = diameterOfBinaryTreeRecursive(node.right);
        max = Math.max(left + right + 1, max);
        return Math.max(left, right) + 1;
    }
}
