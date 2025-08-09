//Write a Java program to compare two strings lexicographically.
//        Two strings are lexicographically equal if they are the same length and contain the same
//        characters in the same positions.

import java.util.Scanner;

public class StrPractice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter First Str : ");
        String str1 = sc.nextLine();
        System.out.print(" Enter First Str : ");
        String str2 = sc.nextLine();

        if (str1.compareTo(str2) == 0){
            System.out.println(" Equal");
        }else if (str1.compareTo(str2) == 1){
            System.out.println("str1 is greater");
        }else System.out.println(" str1 is smaller");
    }
}
