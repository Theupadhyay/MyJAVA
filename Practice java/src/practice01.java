import java.util.Scanner;

public class practice01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number to check");
        int input = sc.nextInt();
        if(input % 2 == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
