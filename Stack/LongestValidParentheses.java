package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        char parentheses[] = "((()())".toCharArray();
        Stack stack = new Stack<Character>();
        int index = 0;
        int stackCount = 0;
        int lastCount = 0;
        int currentCount = 0;
        int max = 0;
        boolean reset = false;
        while (index < parentheses.length) {
            char currentChar = parentheses[index];
            if (!stack.isEmpty() && validate(currentChar, (char) stack.peek())) {
                stack.pop();
                currentCount += 2;
                reset = true;
            } else {
                if (reset) {
                    if (stack.size() != stackCount) {
                        lastCount = currentCount;
                        System.out.println("RESET : stack  : " + stack.size());
                    } else {
                        lastCount += currentCount;
                    }
                    stackCount = stack.size();
                    currentCount = 0;
                }
                reset = false;
                stack.push(currentChar);
            }

            // System.out.println("lastcount : " + lastCount + " currentCount : " +
            // currentCount + " stackcount : "
            // + stackCount + " size : " + stack.size() + " max " + max);
            System.out.println(index + " currentCount : "
                    + currentCount + "  lastcount : " + lastCount);
            index++;
            max = lastCount > max ? lastCount : max;
        }
        if (reset) {
            if (stack.size() != stackCount && stack.size() > 0) {
                lastCount = currentCount;
                System.out.println("--RESET--");
            } else {
                lastCount += currentCount;
            }
            stackCount = stack.size();
            currentCount = 0;
            max = lastCount > max ? lastCount : max;
        }

        System.out.println(max);
    }

    private static boolean validate(char currentParent, char stackPeek) {
        return currentParent == ')' && stackPeek == '(';
    }
}
