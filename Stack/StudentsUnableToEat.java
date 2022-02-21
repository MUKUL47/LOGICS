package Stack;

public class StudentsUnableToEat {
    public static void main(String args[]) {
        int[] students = { 1, 1, 1, 0, 0, 1 };
        int[] sandwiches = { 1, 0, 0, 0, 1, 1 };
        boolean r = false;
        int i = 0;
        int j = 0;
        while (true) {
            if (i == students.length) {
                if (!r)
                    break;
                i = 0;
                r = false;
            }
            if (students[i] == sandwiches[j]) {
                students[i] = -1;
                j++;
                r = true;

            }
            if (j == sandwiches.length)
                break;
            i++;
        }
        System.out.println(sandwiches.length - j);
        // for (int ii = 0; ii < students.length; ii++)
        // System.out.print(students[ii] + " ");
    }
}
