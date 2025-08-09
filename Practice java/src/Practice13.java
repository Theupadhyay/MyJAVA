import java.util.Scanner;

//55. Write a Java program to convert seconds to hours, minutes and seconds.
//        Sample Output:
//
//        Input seconds: 86399
//        23:59:59
public class Practice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds to convert : ");
        int second = sc.nextInt();
        int sec = second % 60;
        int Min = (second / 60) % 60;
        int Hr = second / 60 / 60;
        System.out.println(Hr+":"+Min+":"+sec);
    }
}
