import java.util.Scanner;

public class ExceptionDemo {
    public static void divisionDemo (int dividend, int devisor) throws ArithmeticException{
        System.out.println("result is : " +dividend/devisor);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        try {
//            System.out.println("I am in my first try block");
//            try {
//                arr[6] = 10;
//            } catch (Exception e) {
//                System.out.println(e.toString());
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        int age = sc.nextInt();
//        if (age < 18) {
//            throw new RuntimeException("Sorry you can not vote!!!!");
//        }else System.out.println("You are Eligible to Vote!!!!");
        divisionDemo(10,0);
    }
}
