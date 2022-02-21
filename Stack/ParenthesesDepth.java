package Stack;

import java.util.Stack;
import java.util.ArrayList;

public class ParenthesesDepth {
    public static void main(String[] args) {
        String str = "(()())(())(()(()))";
        int index = 0;
        int level = 0;
        String outputStr = "";
        String finalStr = "";
        while (index < str.length()) {
            char c = str.charAt(index);
            if (c == '(') {
                if (level > 0) {
                    outputStr += c;
                }
                level++;
            } else if (c == ')') {
                if (level >= 2) {
                    outputStr += c;
                    if (level == 2) {
                        finalStr += outputStr;
                        outputStr = "";
                    }
                }
                level--;
            }
            index++;
        }
        return finalStr;
    }
}
