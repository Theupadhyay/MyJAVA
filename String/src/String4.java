import java.util.* ;
import java.io.*;
public class String4 {
        public static String convertString(String str) {
            // Write your code here
            String[] words = str.split(" ");
            // Create a StringBuilder to store the result
            StringBuilder result = new StringBuilder();

            // Iterate over each word
            for (String word : words) {
                // Capitalize the first letter and add the rest of the word
                if (word.length() > 0) {
                    result.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1).toLowerCase())
                            .append(" ");
                }
            }

            // Convert the StringBuilder to a String and trim any trailing space
            return result.toString().trim();
        }

}
