package 二叉树;

/**
 * creat by zhaochen on 2018/6/4 20:53
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;
        return generateNode(nums,0,nums.length-1);
    }

    public TreeNode generateNode(int[] nums,int lo,int hi){
        if (lo > hi)
            return null;
        int mid = (lo+hi)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = generateNode(nums,lo,mid-1);
        node.right = generateNode(nums,mid+1,hi);
        return node;
    }
}
