/*You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.
Record a new score of x.
'+'.
Record a new score that is the sum of the previous two scores.
'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid. */

import java.util.Stack;

public class BaseballGameScore {
    public  static int gameScore(String[] arr){
        Stack<Integer> stack = new Stack<>();
        for (String op : arr) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("+")) {
                int top = stack.pop();
                int newTop = stack.peek() + top;
                stack.push(top);
                stack.push(newTop);
            } else stack.push(Integer.parseInt(op));
        }
        int total = 0;
        for (int score : stack) {
            total += score;
        }
        return  total;
    }
    public static void main(String[] args) {

    }
}
