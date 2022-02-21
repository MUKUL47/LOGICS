/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Stack;

/**
 *
 * @author ADMIN1
 */
public class histogramMaxArea {

  public static void main(String[] args) {
    int histogram[] = new int[] { 1, 2, 1,4,12,1,4,2,4,1,2 }, i = 0, maxArea = 0, c = 0;
    Stack<Integer> bars = new Stack<Integer>();
    boolean stillPopping = false;
    while (i < histogram.length) {
      if (bars.isEmpty() || histogram[i] >= histogram[bars.peek()]) {
        bars.push(i++);
      } else {
        int n = bars.peek();
        bars.pop();
        if (!bars.isEmpty())
          maxArea = Math.max(maxArea, histogram[n] * (i - bars.peek() - 1));
        else
          maxArea = Math.max(maxArea, histogram[n] * (i - 0 - 1));
      }

    }
    while (!bars.isEmpty()) {
      int n = bars.peek();
      bars.pop();
      if (!bars.isEmpty())
        maxArea = Math.max(maxArea, histogram[n] * (i - bars.peek() - 1));
      else
        maxArea = Math.max(maxArea, histogram[n] * (i - 0 - 1));
    }
    System.out.println(maxArea + " " + bars);

  }
}
