package 二叉树;

/**
 * creat by zhaochen on 2018/6/4 13:03
 */
public class Solution437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        int res = findPath(root,sum);
        res+=pathSum(root.left,sum);
        res+=pathSum(root.right,sum);
        return res;

    }
    public int findPath(TreeNode node,int num){
        if (node == null)
            return 0;
        int res = 0;
        if (node.val == num)
            res++;//有负数情况 所以要继续遍历
        res+=findPath(node.left,num-node.val);
        res+=findPath(node.right,num-node.val);
        return res;

    }
}
