public class StackArr {
static class Stack {
    public static final int MAX = 10;
    public int top;
    public int[] stack;
    Stack() {
        stack = new int[MAX];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean push(int value) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        stack[++top] = value;
        return true;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;  // Returning -1 as an indicator of underflow
        }
        return stack[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}


    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop() + " popped from stack");
        System.out.println("Top element: " + s.peek());

        s.printStack();
    }
}


