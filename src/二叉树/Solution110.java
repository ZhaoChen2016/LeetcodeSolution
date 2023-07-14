package 二叉树;

/**
 * creat by zhaochen on 2018/6/3 20:51
 */
public class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if ( -1<=(leftHeight - rightHeight) && (leftHeight - rightHeight) <= 1)
            return isBalanced(root.left) && isBalanced(root.right);
        else
            return false;

    }

    public int height(TreeNode node){
        if (node == null)
            return 0;
        return Math.max(height(node.left) , height(node.right)) + 1;
    }
}
