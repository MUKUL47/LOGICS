package Stack;

import java.util.ArrayList;

public class BuildArrayOp {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        int[] arr = { 4, 6 };
        int current = 1;
        for (int i = 0; i < arr.length;) {
            if (current < arr[i]) {
                list.add("Push");
                list.add("Pop");
                current++;
            } else {
                list.add("Push");
                i++;
                current++;
            }
        }
        System.out.println(list);
    }
}
// ["Push","Push","Pop","Push","Pop","Push","Push","Pop","Push"]
// [push,push,pop, push, pop, push, pop, push, push, pop, push, pop, push]