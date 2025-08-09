//Write a Java program to print the ASCII value of a given character.

import java.util.Scanner;

public class WriteASCII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char i = sc.next().charAt(0);
        int ascii = (int) i;
        System.out.println(ascii);
    }
}
