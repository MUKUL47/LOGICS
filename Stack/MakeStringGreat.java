package Stack;

import java.util.Stack;

public class MakeStringGreat {

    public static void main(String[] args) {
        String s = "kkdsFuqUfSDKK";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = (char) s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                char peek = (char) stack.peek();
                if ((int) c == (int) peek || Character.toUpperCase(peek) != c && Character.toUpperCase(c) != peek) {
                    stack.push(c);
                } else {
                    stack.pop();
                }
            }
        }
        String o = "";
        while (!stack.isEmpty())
            o = stack.pop() + o;
        System.out.println(stack.toArray().toString());
    }
}
