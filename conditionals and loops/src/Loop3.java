import java.util.Scanner;

//Take as input a fraction in the form a/b. Convert the same into lowest terms and print. (Lowest terms examples 3/12 = 1/4).
public class Loop3 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter Numeraot");
        int numerator = sc.nextInt();
        System.out.println("Enter Denominator");
        int denomerator = sc.nextInt();

        int a, b , temp , gcd;

        if (numerator> denomerator){
            a = numerator;
            b = denomerator;

        }else{
            b= numerator;
            a= denomerator;
        }
        while (b!= 0){
            temp = b;
            b = a%b;
            a = temp;

        }
        gcd = a;
        System.out.println("In lowest Form "+ numerator/gcd + "/"+ denomerator/gcd);


    }
}
