//Write a Java program to input and display your password.

import java.io.Console;

public class Practice07 {
    public static void main(String[] args) {
        Console cons; // declare consol
        // check if the sys consol is available.
        if((cons = System.console()) != null){
            // Declare a character array 'pass_ward' to store the password.
            char[] pass_ward = null;
            try{
                // Prompt the user to input their password.
                pass_ward = cons.readPassword("Enter your password");
                System.out.println("Your password was : " + new String(pass_ward));
            }finally {
                // Ensure that the password array is securely cleared.
                if(pass_ward != null){
                    java.util.Arrays.fill(pass_ward,' ');
                }
            }
        }else{
            throw new RuntimeException("cant get the password");
        }
    }
}
