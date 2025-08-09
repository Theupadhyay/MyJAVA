//Write a Java program to concatenate a given string to the end of another string.

import java.util.Scanner;

public class StrPractice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first string :");
        String str1 = sc.nextLine();
        System.out.println(" Enter first string :");
        String str2 = sc.nextLine();

//        System.out.println(str1+str2);
        String str3 = str1.concat(str2);
        System.out.println(str3);



    }
}
