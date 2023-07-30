package stack;

import java.util.Stack;

public class Solution735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (Integer i : asteroids){
            if (stack.peek() == null){
                stack.push(i);
                continue;
            }

            while ( i < 0 && stack.peek() > 0 && stack.peek() < -i){
                stack.pop();
            }
            if (i < 0 && stack.peek() > 0 && stack.peek() > -i){
                continue;
            }

            if (stack.peek() < 0 || i > 0 ){
                stack.push(i);
            }

        }
        return stack.stream().mapToInt(i->i).toArray();
    }
}
