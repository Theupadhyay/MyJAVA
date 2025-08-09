import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int digit,sum =0;
        while(num>0){
            digit = num %10;
            sum+= digit;
            num = num/10;
//executes until the condition number!=0 becomes false
//      for(sum=0; number!=0; number=number/10)
//      {
////finds the last digit and add it to the variable sum
//                sum = sum + number % 10;
//       }
        }
        System.out.println(sum);
    }
}
