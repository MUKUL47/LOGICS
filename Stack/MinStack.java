package Stack;

import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        MiniStack minStack = new MiniStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("min " + minStack.getMin());
        minStack.pop();
        System.out.println("top " + minStack.top());
        System.out.println("min " + minStack.getMin());
        // minStack.pop();
        // System.out.println("min " + minStack.getMin());
        // minStack.pop();
        // System.out.println("min " + minStack.getMin());
    }
}

class MiniStack {

    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();
    int min = Integer.MAX_VALUE;

    public void push(int val) {
        System.out.println(min);
        System.out.println("push " + val);
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
        stack.push(val);
        System.out.println("minStack - push " + minStack);
        System.out.println("stack - push " + stack);
    }

    public void pop() {
        System.out.println("pop");
        int m = stack.pop();
        if (minStack.peek() >= m && minStack.size() > 1) {
            minStack.pop();
        }
        System.out.println("minStack - pop " + minStack);
        System.out.println("stack - pop " + stack);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}