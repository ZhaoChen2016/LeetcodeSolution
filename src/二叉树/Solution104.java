package 二叉树;

/**
 * creat by zhaochen on 2018/5/30 15:38
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
public class Solution104 {
        public int maxDepth(TreeNode root) {
            if (root == null)
                return 0;
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;

        }
}
