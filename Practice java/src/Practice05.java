//Write a Java program to reverse a string.
//        Input Data:
//        Input a string: The quick brown fox
//        Expected Output
//
//        Reverse string: xof nworb kciuq ehT

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the String : ");
        char[] x = sc.nextLine().toCharArray();
        for (int i = x.length -1 ; i >= 0; i--) {
            System.out.print(x[i]);
        }
    }
}
