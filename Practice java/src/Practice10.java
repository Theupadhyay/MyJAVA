//52. Write a Java program to calculate the sum of two integers and
// return true if the sum is equal to a third integer.
//Sample Output:
//
//Input the first number : 5
//Input the second number: 10
//Input the third number : 15
//The result is: true

import java.util.Scanner;

public class Practice10 {
    static boolean isEqual(int a,int b ,int x){
        if((a +b) == x){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 value :");
        int a = sc.nextInt();
        System.out.print("Enter 2 value :");
        int b = sc.nextInt();
        System.out.print("Enter 3 value :");
        int x = sc.nextInt();
        System.out.println(isEqual(a,b,x));
    }
}


//import java.util.*;
//
//public class Exercise52 {
//    public static void main(String[] args) {
//        // Create a Scanner object for user input
//        Scanner in = new Scanner(System.in);
//
//        // Prompt the user to input the first number
//        System.out.print("Input the first number: ");
//        int x = in.nextInt();
//
//        // Prompt the user to input the second number
//        System.out.print("Input the second number: ");
//        int y = in.nextInt();
//
//        // Prompt the user to input the third number
//        System.out.print("Input the third number: ");
//        int z = in.nextInt();
//
//        // Calculate the result using the sumoftwo function and display it
//        System.out.print("The result is: " + sumoftwo(x, y, z));
//
//        // Print a new line for better formatting
//        System.out.print("\n");
//    }
//
//    // Function to check if the sum of two numbers equals the third number
//    public static boolean sumoftwo(int p, int q, int r) {
//        return ((p + q) == r || (q + r) == p || (r + p) == q);
//    }
//}
