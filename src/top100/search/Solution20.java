package top100.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)).equals(stack.peek())){
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }
        return stack.empty() ? true : false;
    }
}
