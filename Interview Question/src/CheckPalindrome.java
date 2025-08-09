import java.util.* ;
import java.io.*;

public class CheckPalindrome {


        public static boolean checkPalindrome(String str) {
            // Normalize the string
            StringBuilder normalizedStr = new StringBuilder();

            for (char c : str.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    normalizedStr.append(Character.toLowerCase(c));
                }
            }

            // Check if the normalized string is a palindrome
            String normalized = normalizedStr.toString();
            String reversed = normalizedStr.reverse().toString();

            return normalized.equals(reversed);
        }

        public static void main(String[] args) {
            // Sample test cases
            String input1 = "N2 i&nJA?a& jnI2n";
            String input2 = "A1b22Ba";

            System.out.println(checkPalindrome(input1)); // Output: Yes
            System.out.println(checkPalindrome(input2)); // Output: No
        }

}
