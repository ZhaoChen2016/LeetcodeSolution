package stack;

import java.util.Stack;

/*
* 单调栈法
* 在stack中的数字都是递增的 如果比栈顶元素大 则栈顶元素出栈 所以栈顶元素为当前栈的最大值
* */
public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prev = stack.pop();
                result[prev] = i - prev;
            }
            stack.push(i);
        }
        return result;
    }
}
