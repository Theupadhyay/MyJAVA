//Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
//        Sample Output:
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter First digit ");
        int a = sc.nextInt();
        System.out.printf("Enter second digit ");
        int b = sc.nextInt();
        System.out.printf("Enter third digit ");
        int c = sc.nextInt();
        int sum = a + b;
        if(sum==c){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}