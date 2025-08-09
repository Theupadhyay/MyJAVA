import java.util.Scanner;

public class StrPractice01 {

    // Write a Java program to get the character at the given index within the
    // string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println(str.charAt(0) + " " + str.charAt(10));

//        for (int i = 0; i < str.length(); i++) {
//            if (i == 0) {
//                System.out.println(str.charAt(i));
//            }
//            if (i == 10) {
//                System.out.println(str.charAt(i));
//            }
//        }
    }
}
