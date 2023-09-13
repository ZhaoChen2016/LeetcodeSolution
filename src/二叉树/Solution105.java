package 二叉树;

import java.util.HashMap;

public class Solution105 {
    private HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    public TreeNode myBuildTree(int[] preorder, int[] inorder, int inorderLeft, int inorderRight, int preorderLeft, int preorderRight){
        if (preorderLeft > preorderRight)
            return null;
        int preorderRootVal = preorder[preorderLeft];
        int inorderRootIdx = map.get(preorderRootVal);
        int leftLength = inorderRootIdx - inorderLeft;
        TreeNode root = new TreeNode(preorderRootVal);
        root.left = myBuildTree(preorder, inorder, inorderLeft, inorderRootIdx - 1, preorderLeft + 1, preorderLeft + leftLength);
        root.right = myBuildTree(preorder, inorder, inorderRootIdx + 1,inorderRight, preorderLeft + leftLength + 1, preorderRight);
        return root;
    }
}
