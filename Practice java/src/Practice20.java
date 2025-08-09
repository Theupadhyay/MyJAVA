//63. Write a Java program that accepts two integer values from the user and returns the largest value.
// However if the two values are the same, return 0 and find the smallest value if the two values have
// the same remainder when divided by 6.
//        Sample Output:
//
//        Input the first number : 12
//        Input the second number: 13
//        Result: 13

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Practice20 {
    static int Check(int x , int y ){
        if(x==y){
            return 0;
        }
        if (x%6 ==y%6){
            return Math.min(x, y);
        }else{
            return (x>y) ? x: y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value ");
        int a = sc.nextInt();
        System.out.println("Enter b value ");
        int b = sc.nextInt();
        System.out.println(Check(a,b));
    }
}
