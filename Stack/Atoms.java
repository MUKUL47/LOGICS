package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import IMPLEMENTATION_HACKERRANK.check;

public class Atoms {
    public static void main(String s[]) {
        Map<String, Integer> map = new HashMap<>();
        Stack<Character> stack = new Stack<Character>();
        int index = 0;
        String formula = "H2O2He3Mg4";
        String atomSize = "";
        while (index <= formula.length()) {
            if (index == formula.length()) {
                String remainingFormula = "";
                while (!stack.isEmpty())
                    remainingFormula = stack.pop() + remainingFormula;
                map.put(remainingFormula, atomSize.length() > 0 ? Integer.parseInt(atomSize) : 1);
                break;
            }
            char currentC = formula.charAt(index);
            boolean isNotLower = (int) currentC >= 97 && (int) currentC < 123;
            if (!isNotLower && !stack.empty()) {
                char peek = stack.peek();
                // check if is number
                if (charCode("INTEGER", currentC)) {
                    atomSize += currentC;
                }
                // uppercase or lower
                else if (charCode("UPPERCASE", peek) || charCode("LOWERCASE", peek)) {
                    String remainingFormula = "";
                    while (!stack.isEmpty())
                        remainingFormula = stack.pop() + remainingFormula;
                    map.put(remainingFormula, atomSize.length() > 0 ? Integer.parseInt(atomSize) : 1);
                    stack.push(currentC);
                    atomSize = "";
                }
            } else {
                stack.push(currentC);
                atomSize = "";
            }
            index++;
        }
        System.out.println(map);
    }

    public static boolean charCode(String type, char c) {
        switch (type) {
            case "UPPERCASE":
                return (int) c >= 65 && (int) c < 91;
            case "LOWERCASE":
                return (int) c >= 97 && (int) c < 123;
            case "INTEGER":
                return (int) c >= 49 && (int) c < 58;
            default:
                throw new Error("INVALID CHAR CODE");
        }
    }
}
