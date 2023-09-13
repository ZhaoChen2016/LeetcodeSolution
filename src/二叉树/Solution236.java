package 二叉树;

public class Solution236 {
    TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return res;
    }

    public Boolean dfs(TreeNode node, TreeNode p, TreeNode q){
        if (node == null){
            return false;
        }
        Boolean left = dfs(node.left, p, q);
        Boolean right = dfs(node.right, p, q);
        if ((left && right) || (left || right) && (node.val == p.val || node.val == q.val))
            res = node;
        return left || right || node.val == p.val || node.val == q.val;
    }
}
