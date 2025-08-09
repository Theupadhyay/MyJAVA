//Take 10 integers from keyboard using loop and print their average value on the screen.


import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        for(int i =0 ; i<10; i++){
            System.out.println("Enter a number");
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
