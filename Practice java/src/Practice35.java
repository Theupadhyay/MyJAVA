//86. Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply
//    it by 3 and add 1 if it is odd. Repeat the process until n = 1.

import java.util.Scanner;

public class Practice35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        while (n!=1){
            if(n%2==0){
                n/=2;
            }else{
                n = (n*3)+1;
            }
        }
        System.out.println(n);
//        if (n != 1) {
//            if (n % 2 == 0 || n % 2 != 0) {
//                if (n % 2 == 0) {
//                    n /= 2;
//                } else {
//                   n= (n/3) +1;
//                }
//            }
//        }
    }
}
