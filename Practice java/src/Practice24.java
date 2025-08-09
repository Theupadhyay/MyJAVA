//69. Write a Java program to extract the first half of a even string.
//        Test Data: Python
//        Sample Output:
//        Pyt

import java.util.Scanner;

public class Practice24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str =sc.nextLine().toCharArray();
        for (int i = 0; i < str.length/2 ; i++) {
            System.out.print(str[i]);
        }
    }
}
