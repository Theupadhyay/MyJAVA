import java.util.Stack;

public class Postfix {
    public static int postfix(String input) {
        Stack<Integer> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');  // Convert char to integer
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (ch) {
                    case '+': stack.push(operand1 + operand2); break;
                    case '-': stack.push(operand1 - operand2); break;
                    case '*': stack.push(operand1 * operand2); break;
                    case '/': stack.push(operand1 / operand2); break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String input = "231*+9-";
        System.out.println("Postfix Evaluation Result: " + postfix(input));
    }
}
