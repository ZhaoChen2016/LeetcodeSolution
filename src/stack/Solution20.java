package stack;

import java.util.Stack;

/**
 * creat by zhaochen on 2018/5/23 14:32
 */
public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' ||c == '[' )
                stack.push(c);
            else {
                if (stack.size() == 0)
                    return false;
                char p = stack.pop();
                char match;
                if (c == '}')
                    match = '{';
                else if (c == ']')
                    match = '[';
                else
                    match = '(';
                if (p != match)
                    return false;
            }

        }
        if (stack.size() != 0)
            return false;
        return true;
    }
}
