import java.util.Map;
import java.util.Scanner;

public class Practice38 {
    static boolean isArmstrong(int n) {
        int digit= 0 ,sum = 0, last , temp;
        temp = n;
        while (temp > 0){
            temp /= 10;
            digit++;
        }
        temp = n ;
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digit);
            temp /= 10;
        }
        if (n==sum)return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (isArmstrong(i)){
                System.out.print(i+", ");
            }
        }
    }
}
