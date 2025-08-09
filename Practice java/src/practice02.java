//33. Write a Java program and compute the sum of an integer's digits.
//        Input Data:
//        Input an integer: 25
//        Expected Output
//
//        The sum of the digits is: 7


import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int N = sc.nextInt();
        int a = N % 10;
        int b = N / 10;
        System.out.println(a+b);
    }
}
