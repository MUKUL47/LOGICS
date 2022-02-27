package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class Atoms {
    public static void main(String s[]) {
        Map<String, Integer> map = new TreeMap<>();
        String formula = "Mg((H2O)2Na)4(F)(H2SO4)N";
        calculateFormula(formula, map, 1);
        String finalFormula = "";
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            int val = m.getValue();
            finalFormula += m.getKey() + "" + (val > 1 ? val : "");
        }
        System.out.println(finalFormula);
    }

    public static void calculateFormula(String formula, Map<String, Integer> map, int size) {
        String tempFormula = "";
        int index = 0;
        int atomSize = 1;
        Stack<Character> stack = new Stack<>();
        boolean isNested = false;
        boolean isLastAtom = false;
        while (index < formula.length()) {
            char currentC = formula.charAt(index);
            boolean isNotLower = !charCode("LOWERCASE", currentC);
            boolean isParen = currentC == '(' || currentC == ')';
            if (isNotLower &&
                    stack.empty() &&
                    currentC != '(' &&
                    tempFormula.length() > 0) {
                boolean isAtomSize = charCode("INTEGER", currentC);
                if (isAtomSize) {
                    atomSize = !isLastAtom
                            ? Integer.parseInt(String.valueOf(currentC))
                            : atomSize * 10 + Integer.parseInt(String.valueOf(currentC));
                    isLastAtom = true;
                } else {
                    if (isNested) {
                        calculateFormula(tempFormula, map, atomSize * size);
                    } else {
                        addToMap(tempFormula, map, size, atomSize);
                    }
                    atomSize = 1;
                    tempFormula = currentC + "";
                    isLastAtom = false;
                }
            } else {
                if (isParen) {
                    isLastAtom = false;
                    if (currentC == '(' && tempFormula.length() > 0 && stack.isEmpty()) {
                        calculateFormula(tempFormula, map, atomSize * size);
                        tempFormula = "";
                        atomSize = 1;
                    } else if (tempFormula.length() > 0 && !isNested && currentC == '(') {
                        addToMap(tempFormula, map, size, atomSize);
                        tempFormula = "";
                    }
                    isNested = true;
                    if (!stack.isEmpty() && stack.peek() == '(' && currentC == ')') {
                        stack.pop();
                    } else {
                        stack.push(currentC);
                    }
                }
                if (!isParen
                        || (isParen && (stack.size() > 1 && currentC == '(' || !stack.isEmpty() && currentC == ')'))) {
                    tempFormula += currentC;
                }
            }
            if (index == formula.length() - 1) {
                if (isNested || currentC == ')')
                    calculateFormula(tempFormula, map, atomSize * size);
                else
                    addToMap(tempFormula, map, size, atomSize);
            }
            index++;
        }
    }

    public static void addToMap(String formula, Map<String, Integer> map, int size, int atomSize) {
        boolean exists = map.containsKey(formula);
        map.put(formula, !exists ? atomSize * size
                : map.get(formula) +
                        (atomSize) * size);
    }

    public static boolean charCode(String type, char c) {
        switch (type) {
            case "UPPERCASE":
                return (int) c >= 65 && (int) c < 91;
            case "LOWERCASE":
                return (int) c >= 97 && (int) c < 123;
            case "INTEGER":
                return (int) c >= 48 && (int) c < 58;
            default:
                throw new Error("INVALID CHAR CODE");
        }
    }
}
