//65. Write a Java program to calculate the modules of two numbers without using any
//    inbuilt modulus operator.
//        Sample Output:
//
//        Input the first number : 19
//        Input the second number: 7
//        5

import java.util.Scanner;

public class Practice22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        System.out.println("Enter b value : ");
        int b = sc.nextInt();

        int c = a/b;
        int ans = a-(b*c);
        System.out.println(ans);
    }
}
