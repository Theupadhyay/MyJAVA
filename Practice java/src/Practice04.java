// Write a program to convert decimal number to binary number :

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        int decimalNum , quotient , i = 0 , j;
        int[] binaryNumber = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("inter a decimal no.");

        decimalNum = sc.nextInt();
        quotient = decimalNum;

        while (quotient!=0){
            binaryNumber[i++]= quotient % 2;
            quotient = quotient / 2;
        }
        System.out.print("Binary no. is : ");
        for ( j = i-1; j > 0 ; j--) {
            System.out.print(binaryNumber[j]);
        }
        System.out.println();
    }
}
