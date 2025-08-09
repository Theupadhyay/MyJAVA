//54. Write a Java program that accepts three integers from the user and
// returns true if two or more of them (integers) have the same rightmost digit.
// The integers are non-negative.
//Sample Output:
//
//Input the first number : 5
//Input the second number: 10
//Input the third number : 15
//The result is: true

import java.util.Scanner;

public class Practice12 {
    static boolean isTwoRightSame(int a , int b ,int c ){
        return (a % 10 == b % 10) || (b % 10 == c % 10) || (c % 10 == a % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 value :");
        int a = sc.nextInt();
        System.out.print("Enter 2 value :");
        int b = sc.nextInt();
        System.out.print("Enter 3 value :");
        int c = sc.nextInt();
        System.out.println(isTwoRightSame(a,b,c));
    }
}
