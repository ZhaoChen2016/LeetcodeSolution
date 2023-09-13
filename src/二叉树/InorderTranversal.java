package 二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InorderTranversal {
/*
* 中序遍历的迭代写法 结合栈使用
* */
    public List<TreeNode> traverse(TreeNode node){
        List<TreeNode> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = node;
        while (cur != null || !stack.isEmpty()){
            while (cur.left != null){
                cur = cur.left;
                stack.push(cur);
            }
            cur = stack.pop();
            list.add(cur);
            cur = cur.right;
        }
        return list;
    }
}
