import java.util.Scanner;

public class PowerOf3 {
    public static boolean powerOfThree(int n ) {
        if (n == 1) {
            return true;
        }
        if (n == 0 || n % 3 != 0) {
            return false;
        }
        return powerOfThree(n / 3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(powerOfThree(n));
    }
}
