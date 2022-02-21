package Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreater1 {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] nums2 = { 1, 3, 4, 2 };
        int[] nums1 = { 4, 1, 2 };
        int[] output = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int nextBig = -1;
            while (!stack.empty()) {
                int top = stack.peek();
                if (top > nums2[i]) {
                    nextBig = top;
                    break;
                }
                stack.pop();
            }
            stack.push(nums2[i]);
            map.put(nums2[i], nextBig);
        }
        for (int i = 0; i < nums1.length; i++) {
            output[i] = map.get(nums1[i]);
        }
        System.out.println(map);
    }
}