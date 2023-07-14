package 二叉树;

/**
 * creat by zhaochen on 2018/6/4 12:43
 */
public class Solution129 {
    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        return sumHelper(root,0);

    }

   public int sumHelper(TreeNode node,int sum){
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return sum*10+node.val;
        int left = sumHelper(node.left,sum*10+node.val);
        int right = sumHelper(node.right,sum*10+node.val);
        return left+right;
   }
}
