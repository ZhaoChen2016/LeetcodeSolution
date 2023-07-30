package top100.BST;

public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        invertTreeRecursive(root);
        return root;
    }

    public void invertTreeRecursive(TreeNode node) {
        if (node == null){
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        invertTreeRecursive(node.left);
        invertTreeRecursive(node.right);
    }
}
