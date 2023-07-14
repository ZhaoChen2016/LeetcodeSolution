package stack;

import java.util.Stack;

/**
 * creat by zhaochen on 2018/5/23 15:19
 */
public class Solution150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int i1,i2;
        for (int i = 0; i < tokens.length; i++){
            String token  =tokens[i];
            if (token.equals("+")){
                i1 = stack.pop();
                i2 = stack.pop();
                stack.push(i1+i2);
            }else if (token.equals("-")){
                i1 = stack.pop();
                i2 = stack.pop();
                stack.push(i2-i1);
            }else if (token.equals("*")){
                i1 = stack.pop();
                i2 = stack.pop();
                stack.push(i2*i1);
            }else if (token.equals("/")){
                i1 = stack.pop();
                i2 = stack.pop();
                stack.push(i2/i1);
            }else
                stack.push(Integer.parseInt(token));
        }
        return stack.pop();

    }
}
