import java.util.Scanner;

public class fibonacciS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < n; i++) {
            int c = a + b ;
            System.out.println(c);
            a = b;
            b=c;
        }
    }
}
