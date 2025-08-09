//66. Write a Java program to compute the sum of the first 100 prime numbers.
//        Sample Output:
//
//        Sum of the first 100 prime numbers: 24133

public class Practice23 {

    public static void main(String[] args) {
    int sum = 0;
    int a = 1;
        for (int i = 1; i < 100 ; i++) {
            int count =0;
            for (int j = 2; j <= i/2 ; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==0 && i != 1){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
//
//
//public class PrintPrimeNumbers1 {
//
//    public static void main(String[] args)
//    {
//        int i, number, count, sum = 0
//
//        for(number = 1; number <= 100; number++)
//        {
//            count = 0;
//            for (i = 2; i <= number/2; i++)
//            {
//                if(number % i == 0)
//                {
//                    count++;
//                    break;
//                }
//            }
//            if(count == 0 && number != 1 )
//            {
//                sum = sum + number;
//            }
//        }
//        System.out.println("\n The Sum of Prime Numbers from 1 to 100 = " + sum);
//    }
//}
