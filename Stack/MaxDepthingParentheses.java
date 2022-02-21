package Stack;

import java.util.Stack;

public class MaxDepthingParentheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int index = 0;
        int maxIndex = 0;
        int cc = 0;
        while (index < s.length()) {
            char c = s.charAt(index);
            if (c == '(') {
                cc++;
                maxIndex = cc > maxIndex ? cc : maxIndex;
            } else if (c == ')') {
                c--;
            }
            index++;
        }
        System.out.println(maxIndex);
        // return maxIndex;
    }
}
