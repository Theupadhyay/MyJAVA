//64. Write a Java program that accepts two integer values between 25 and 75 and
// returns true if there is a common digit in both numbers.
//        Sample Output:
//
//        Input the first number : 35
//        Input the second number: 45
//        Result: true

import java.util.Scanner;

public class Practice21 {

    static boolean check(int x,int y){
        x = x%10;
        y = y%10;
        if (x == y){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value 1:");
        int a = sc.nextInt();
        System.out.println("Enter the value 1:");
        int b = sc.nextInt();
        System.out.println(check(a,b));

    }
}
