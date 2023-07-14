package 二叉树;

/**
 * creat by zhaochen on 2018/6/4 19:41
 */
public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        return validator(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean validator(TreeNode root,long min,long max){
        if (root == null)
            return true;
        if (root.val > min && root.val < max)
            return validator(root.left,min,root.val) && validator(root.right,root.val,max);
        //一个节点的两个临界值 其中一个是父节点，还有另外一个临界点是父节点的父节点 右子树上的所有值都要大于这个节点
        return false;
    }
}
