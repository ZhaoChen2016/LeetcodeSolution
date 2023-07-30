package top100.BST;

public class Solution617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode cur = new TreeNode();
        if (root1 == null && root2 == null){
            return null;
        }
        if (root1 == null && root2 != null){
            cur.val = root2.val;
            cur.left = root2.left;
            cur.right = root2.right;
            return cur;
        }
        if (root1 != null && root2 == null){
            cur.val = root1.val;
            cur.left = root1.left;
            cur.right = root1.right;
            return cur;
        }
        cur.val = root1.val + root2.val;
        cur.left = mergeTrees(root1.left, root2.left);
        cur.right = mergeTrees(root1.right, root2.right);
        return cur;
    }
}
