import java.util.Stack;
public class Infix {
        public static int precedence(char operator) {
            switch (operator) {
                case '+': case '-': return 1;
                case '*': case '/': return 2;
                default: return -1;
            }
        }

        public static int applyOperation(int a, int b, char operator) {
            switch (operator) {
                case '+': return a + b;
                case '-': return a - b;
                case '*': return a * b;
                case '/': return a / b;
                default: throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }

        public static int evaluateInfix(String expression) {
            Stack<Integer> operandStack = new Stack<>();
            Stack<Character> operatorStack = new Stack<>();

            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                // Skip spaces
                if (ch == ' ') continue;

                // If it's a digit, extract the full number
                if (Character.isDigit(ch)) {
                    int num = 0;
                    while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                        num = num * 10 + (expression.charAt(i) - '0');
                        i++;
                    }
                    i--;  // Adjust index as for loop will increment it
                    operandStack.push(num);
                }
                // If it's an opening bracket, push to operator stack
                else if (ch == '(') {
                    operatorStack.push(ch);
                }
                // If it's a closing bracket, solve inside brackets
                else if (ch == ')') {
                    while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                        int b = operandStack.pop();
                        int a = operandStack.pop();
                        char op = operatorStack.pop();
                        operandStack.push(applyOperation(a, b, op));
                    }
                    operatorStack.pop(); // Remove '(' from stack
                }
                // If it's an operator
                else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(ch)) {
                        int b = operandStack.pop();
                        int a = operandStack.pop();
                        char op = operatorStack.pop();
                        operandStack.push(applyOperation(a, b, op));
                    }
                    operatorStack.push(ch);
                }
            }

            // Process remaining operators
            while (!operatorStack.isEmpty()) {
                int b = operandStack.pop();
                int a = operandStack.pop();
                char op = operatorStack.pop();
                operandStack.push(applyOperation(a, b, op));
            }

            return operandStack.pop();
        }

        public static void main(String[] args) {
            String infixExp = "3 + 5 * ( 2 - 8 )";  // Expected result: -25
            System.out.println("Infix Evaluation Result: " + evaluateInfix(infixExp));
        }


}
