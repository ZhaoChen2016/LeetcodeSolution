package 二叉树;

/**
 * creat by zhaochen on 2018/6/3 12:31
 */
public class Solution222 {
    /*public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int leftNode = countNodes(root.left);
        int rightNode = countNodes(root.right);
        return leftNode+rightNode+1;
    }时间复杂度太高 time limit exceeded*/
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int right = rightHeight(root);
        int left = leftHeight(root);
        if (right == left)
            return (1 << right) -1;
        else
            return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int rightHeight (TreeNode right){
        if (right == null)
            return 0;
        int  height = rightHeight(right.right);
        return height+1;
    }

    public int leftHeight (TreeNode left){
        if (left == null)
            return 0;
        int  height = leftHeight(left.left);
        return height+1;
    }
}
