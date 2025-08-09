//57. Write a Java program to accept an integer and count the factors of the number.
//        Sample Output:
//
//        Input an integer: 25
//        3

import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int ip = sc.nextInt();
        for (int i = 1; i <= ip; i++) {
            if(ip % i == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
