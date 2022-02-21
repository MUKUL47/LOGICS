package Stack;

import java.util.Stack;

public class FifoFromStack {

    public static void main(String[] args) {
        String parentheses = "[](){";
        Stack stack = new Stack<Character>();
    }
}

class MyQueue {

    private Stack stackQueue;

    public MyQueue() {
        stackQueue = new Stack<Integer>();
    }

    public void push(int x) {
        stackQueue.push(x);
    }

    public int pop() {
        int first = (int) stackQueue.get(0);
        stackQueue.remove(first);

        return first;
    }

    public int peek() {
        return (int) stackQueue.get(0)
    }

    public boolean empty() {
        return stackQueue.isEmpty();
    }
}
