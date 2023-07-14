package 二叉树;

/**
 * creat by zhaochen on 2018/6/4 21:27
 */
public class Solution230 {
    int count = 0;
    TreeNode node ;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return node.val;
    }

    public void inOrder(TreeNode root,int k){
        if (root == null)
            return;
        inOrder(root.left,k);

        if (count == k){
            node = root;
            return;
        }
        inOrder(root.right,k);
        count = count+1;
    }


}
