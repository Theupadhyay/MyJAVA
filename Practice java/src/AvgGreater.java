import java.util.*;
public class AvgGreater {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt(); // Reads the number of test cases
            while (x > 0) {
                int a = sc.nextInt(); // Reads the first integer of the test case
                int b = sc.nextInt(); // Reads the second integer of the test case
                int c = sc.nextInt(); // Reads the third integer of the test case
                if (a + b > 2 * c) {
                    System.out.println("yes"); // Prints "yes" if the condition is true
                } else {
                    System.out.println("no"); // Prints "no" if the condition is false
                }
                x--; // Decrement x after each iteration
            }
        }
}
