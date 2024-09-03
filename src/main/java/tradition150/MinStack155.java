package tradition150;

import java.util.Stack;

public class MinStack155 {

    private class TestCase {

    }

    public static void solution() {

    }

    /**
     * Solution
     */
    class MinStack {

        Stack<Integer> stack;
        Stack<Integer> min;

        public MinStack() {
            stack = new Stack<>();
            min = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if(min. isEmpty() || val <= min.peek()) {
                min.push(val);
            }
        }

        public void pop() {
            int val = stack.pop();
            if(val == min.peek()) {
                min.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }
}
