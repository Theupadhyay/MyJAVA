import java.util.Scanner;

//11. Write a Java program to create a String object with a character array.
public class StrPractice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String ");
//        char[] string = sc.toString().toCharArray();
//        System.out.println(string);
        char[] arr = new char[]{'1', '2', '3', '4'};
        String str = String.copyValueOf(arr, 1, 3);
        System.out.println("The No. of strudent in my section  is : " + str);
    }
}
