package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Atoms {
    public static void main(String s[]) {
        Map<String, Integer> map = new HashMap<>();
        String formula = "K4(ON(SO3)2)2";
        calculateFormula(formula, map, 1);
        System.out.println(map);
    }

    public static void calculateFormula(String formula, Map<String, Integer> map, int size) {
        System.out.println(formula + " " + map + " " + size);
        Stack<Character> stack = new Stack<Character>();
        int index = 0;
        String atomSize = "";
        int nestedBrackets = 0;
        boolean isNestedFormula = false;
        while (index <= formula.length()) {
            if (index == formula.length()) {
                if (isNestedFormula) {
                    calculateFormula(getFormula(stack), map, atomSize.length() > 0 ? Integer.parseInt(atomSize) : 1);
                    break;
                }
                String remainingFormula = getFormula(stack);
                if (remainingFormula.length() > 0) {
                    map.put(remainingFormula, atomSize.length() > 0 ? Integer.parseInt(atomSize) * size : size);
                }
                break;
            }
            char currentC = formula.charAt(index);
            boolean isNotLower = (int) currentC >= 97 && (int) currentC < 123;
            boolean isNestedParen = currentC == '(' || currentC == ')';
            if (!isNotLower && !stack.empty() && nestedBrackets == 0) {
                char peek = stack.peek();
                // check if is number
                if (charCode("INTEGER", currentC)) {
                    atomSize += currentC;
                }
                // uppercase or lower
                else if (charCode("UPPERCASE", peek) || charCode("LOWERCASE", peek) || isNestedFormula) {
                    String remainingFormula = getFormula(stack);
                    if (isNestedFormula) {
                        isNestedFormula = false;
                        calculateFormula(remainingFormula, map,
                                atomSize.length() > 0 ? Integer.parseInt(atomSize) : 1);
                        atomSize = "";
                    } else {
                        if (remainingFormula.length() > 0) {
                            map.put(remainingFormula, atomSize.length() > 0 ? Integer.parseInt(atomSize) * size : size);
                        }
                        if (isNestedParen) {
                            nestedBrackets = nestedBrackets + (currentC == '(' ? 1 : -1);
                            isNestedFormula = true;
                        }
                    }
                    if (!isNestedFormula)
                        stack.push(currentC);
                }
            } else {
                if (isNestedParen) {
                    nestedBrackets = nestedBrackets + (currentC == '(' ? 1 : -1);
                    isNestedFormula = true;
                } else {
                    stack.push(currentC);
                    atomSize = "";
                }
            }
            index++;
        }
    }

    public static String getFormula(Stack<Character> stack) {
        String f = "";
        while (!stack.isEmpty())
            f = stack.pop() + f;
        return f;
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
