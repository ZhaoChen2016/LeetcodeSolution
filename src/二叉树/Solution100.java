package 二叉树;

/**
 * creat by zhaochen on 2018/5/30 16:13
 */
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q){
        if ((p != null && q == null) || (q != null && p == null))
            return false;
        if (p == null && q == null)
            return true;
        boolean left = isSameTree(p.left,q.left);
        boolean right = isSameTree(p.right,q.right);
        boolean root = false;
        if (p.val == q.val)
            root = true;
        if (left && right && root)
            return true;
        return false;

    }
}
