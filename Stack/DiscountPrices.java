package Stack;

import java.util.Stack;

public class DiscountPrices {
    public static void main(String[] args) {
        int prices[] = { 5, 7, 6, 3, 5, 6, 2 };
        Stack<Integer> stack = new Stack<>();
        int[] results = new int[prices.length];
        // int results[] = new int[prices.length];
        for (int i = prices.length - 1; i >= 0; i--) {
            int discount = 0;
            while (!stack.isEmpty()) {
                int top = stack.peek();
                if (prices[i] >= top) {
                    discount = top;
                    break;
                }
                stack.pop();
            }
            stack.push(prices[i]);
            results[i] = prices[i] - discount;
        }
    }
}
