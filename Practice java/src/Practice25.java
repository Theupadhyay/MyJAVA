//70. Write a Java program to create a string in the form of
// short_string + long_string + short_string from two strings.
// The strings must not have the same length.
//        Test Data: Str1 = Python
//        Str2 = Tutorial
//        Sample Output:
//
//        PythonTutorialPython

import java.util.Scanner;

public class Practice25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String : ");
        char[] str1 = sc.nextLine().toCharArray();
        System.out.println("Enter second String : ");
        char[] str2 = sc.nextLine().toCharArray();
        if(str1.length>str2.length){
            System.out.println(new String(str1)+new String(str2)+new String(str1));
        }else{
            System.out.println(new String(str2)+new String(str1)+new String(str2));
        }
    }
}
