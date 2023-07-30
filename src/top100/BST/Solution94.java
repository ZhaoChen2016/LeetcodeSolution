package top100.BST;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return inorderTraversalRecursive(list, root);
    }

    public List<Integer> inorderTraversalRecursive(List<Integer> list, TreeNode node){
        if (node == null) {
            return list;
        }
        inorderTraversalRecursive(list, node.left);
        list.add(node.val);
        inorderTraversalRecursive(list, node.right);
        return list;
    }


}
