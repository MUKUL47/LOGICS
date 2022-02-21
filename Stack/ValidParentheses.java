package Stack;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String parentheses = "[](){";
        Stack stack = new Stack<Character>();
        int index = 0;
        while (index < parentheses.length()) {
            if (!stack.isEmpty() && validate(parentheses.charAt(index), (char) stack.peek())) {
                stack.pop();
            } else {
                stack.push(parentheses.charAt(index));
            }
            index++;
        }
        System.out.println(stack.isEmpty());
    }

    private static boolean validate(char currentParent, char stackPeek) {
        return currentParent == ')' && stackPeek == '(' || currentParent == ']' && stackPeek == '['
                || currentParent == '}' && stackPeek == '{';
    }
}
