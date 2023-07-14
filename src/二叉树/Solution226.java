package 二叉树;

/**
 * creat by zhaochen on 2018/5/30 16:04
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        invertTree(root.left);
        invertTree(root.right);
        swap(root);
        return root;

    }
    public void swap (TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
