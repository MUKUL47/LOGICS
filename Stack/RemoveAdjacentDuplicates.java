package Stack;

import java.util.Stack;
import java.util.List;

public class RemoveAdjacentDuplicates {
    public static void main(String args[]) {
        String s = "azxxzy";
        int i = 0;
        Stack<Character> stack = new Stack<>();
        List<String> ss = new List<String>();
        while (i < s.length()) {
            char c = s.charAt(i++);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        System.out.println(stack);
    }
}
