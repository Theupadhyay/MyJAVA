import java.util.* ;
import java.io.*;
public class paranthesis01 {

        public static int minimumParentheses(String pattern) {
            // Write your code here.
            int open = 0;
            int unbalanced = 0;

            for (int i = 0; i < pattern.length(); i++) {
                if (pattern.charAt(i) == '(') {
                    open++;
                } else {
                    if (open > 0) {
                        open--;
                    } else {
                        unbalanced++;
                    }
                }
            }

            return open + unbalanced;
        }

    public static void main(String[] args) {
        String pattern = "()()((";
        int result = minimumParentheses(pattern);
        System.out.println(result);
    }
}

