import java.util.*;
import java.util.Scanner;

public class addBinary {
    public static void main(String[] args) {
        long B1, B2;
        int i = 0, remainder = 0;
        int sum[] = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println("Input First number");
        B1 = sc.nextLong();
        System.out.println("input Second number ");
        B2 = sc.nextLong();
        while (B1 != 0 || B2 != 0) {
            sum[i++] = (int) ((B1 % 10 + B2 % 10 + remainder) % 2);
            remainder = (int) ((B1 % 10 + B2 % 10 + remainder) / 2);
            B1 = B1 / 10;
            B2 = B2 / 10;

        }

        if (remainder != 0) {
            sum[i++] = remainder;
            --i;
            System.out.print("Sum of two binary no is : ");

            while (i >= 0) {
                System.out.print(sum[i--]);
            }
            System.out.println("\n");

        }

    }
}

/*
 * --BY GFG--
 * import java.io.*;
 * 
 * // Class
 * class GFG {
 * 
 * // Method
 * public static String addBinary(String x, String y)
 * {
 * int i = x.length() - 1, j = y.length() - 1;
 * int carry = 0;
 * StringBuilder result = new StringBuilder();
 * while (i >= 0 || j >= 0) {
 * int sum = carry;
 * if (i >= 0) {
 * sum += x.charAt(i) - '0';
 * }
 * if (j >= 0) {
 * sum += y.charAt(j) - '0';
 * }
 * if (sum == 0 || sum == 1) {
 * result.append(sum);
 * carry = 0;
 * }
 * else if (sum == 2) {
 * result.append("0");
 * carry = 1;
 * }
 * else {
 * result.append("1");
 * carry = 1;
 * }
 * i--;
 * j--;
 * }
 * if (carry == 1) {
 * result.append("1");
 * }
 * return result.reverse().toString();
 * }
 * 
 * // Main driver method
 * public static void main(String[] args)
 * {
 * String x = "011011";
 * String y = "1010111";
 * 
 * System.out.println(addBinary(x, y));
 * }
 * }
 */