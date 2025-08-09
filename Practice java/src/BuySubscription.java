import java.util.Scanner;

public class BuySubscription {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int c1 = 0;
            int c = n/6;
            if(n % 6 != 0){
                c1++;
            }
            int res=c+c1;
            System.out.println(res*x);
        }
    }
}
