//62. Write a Java program that accepts three integer values and returns true
// if one is 20 or more less than the others' subtractions.
//        Sample Output:
//
//        Input the first number : 15
//        Input the second number: 20
//        Input the third number : 25
//        false


import java.util.Scanner;

public class Practice19 {
    static boolean checkConditions(int first, int second, int third) {
        if (first == 20 || second == 20 || third == 20) {
            if ((first - second) >= 20 || (second - third) >= 20 || (third - first) >= 20) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no :");
        int first = sc.nextInt();
        System.out.print("Enter second no :");
        int second = sc.nextInt();
        System.out.print("Enter third no :");
        int third = sc.nextInt();
        System.out.println(checkConditions(first,second,third));

    }
}
