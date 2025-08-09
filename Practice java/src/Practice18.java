//61. Write a Java program to reverse a word.
//        Sample Output:
//
//        Input a word: dsaf
//        Reverse word: fasd

import java.util.Scanner;

public class Practice18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        for (int i = str.length(); i > 0 ; i--) {
            System.out.print(str.charAt(i-1));
        }
    }
}
