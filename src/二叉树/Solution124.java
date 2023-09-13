package 二叉树;

public class Solution124 {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    public int dfs(TreeNode node){
        if (node == null){
            return 0;
        }
        int left = Math.max(dfs(node.left), 0);
        int right = Math.max(dfs(node.right), 0);
        maxSum = Math.max(maxSum, left + right + node.val);
        return node.val + Math.max(left, right);
    }
}
