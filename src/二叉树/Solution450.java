package 二叉树;

/**
 * creat by zhaochen on 2018/6/4 20:07
 */
public class Solution450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;
        TreeNode dummyNode = new TreeNode(0);
        dummyNode.right = root;
        root = deleteHelper(root,key);
        return root;

    }

    public TreeNode deleteHelper(TreeNode node,int key){
        if (node == null)
            return null;
        if (node.val > key){
            node.right  = deleteHelper(node.left,key);
        }else if (node.val < key){
            node.left = deleteHelper(node.right,key);
        } else {
            if (node.left ==null && node.right != null)
                node = node.right;
            else if (node.right == null && node.left != null )
                node = node.left;
            else if (node.right!= null && node.left != null) {
                TreeNode nodeMax = findMax(node.left);
                node.val = nodeMax.val;
                node.left = deleteHelper(node.left,nodeMax.val);
            }
            else
                node = null;
        }
        return node;
    }

    public TreeNode findMax(TreeNode node){
        if (node == null)
            return null;
        while (node.right != null){
            node = node.right;
        }
        return node;
    }
}
