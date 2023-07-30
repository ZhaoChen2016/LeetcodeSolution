package top100.BST;

public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricRecursive(root.left, root.right);
    }
    
    public boolean isSymmetricRecursive(TreeNode node1, TreeNode node2){
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null && node2 != null) {
            return false;
        }
        if (node1 != null && node2 == null) {
            return false;
        }
        if (node1.val == node2.val) {
            return isSymmetricRecursive(node1.right, node2.left) && isSymmetricRecursive(node1.left, node2.right);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 1;
        root.right = new TreeNode(2);

    }
}
