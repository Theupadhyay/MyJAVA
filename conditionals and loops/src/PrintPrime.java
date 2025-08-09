import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        int i, count ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        System.out.println("The Prime no between 1 to " + n + " is : ");
        for(int j =2 ; j <= n ;j++){
            count=0;
            for(i =1 ; i<=j;i++){
                if (j%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(j+" ");
            }
        }
    }


    //to check no is prime or not
//    static void PrimeCalculate(int num) {
//        int count = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                count++;
//            }
//        }
//        if (count == 2) {
//            System.out.println("Prime number ");
//        } else
//            System.out.println("Not a Prime Number ");
//
//    }
//    public static void main(String[] args) {
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter the N Value ");
//        int n = sc.nextInt();
//        PrimeCalculate(n);
//    }
}
