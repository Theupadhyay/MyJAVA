
import java.util.Scanner;

public class Calcu {


        public static void main(String[] args) {
            double res;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the operator to perform : *  , - , + , / ");
            char op = sc.next().charAt(0);
            System.out.println("Enter the first value N1: ");
            double n1 = sc.nextDouble();
            System.out.println("Enter the first value N2: ");
            double n2 = sc.nextDouble();

            switch (op) {
                case '+':
                    res = n1 + n2;
                    System.out.println(n1 + " + " + n2 + " = " + res);
                    break;
                case '-':
                    res = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " + res);
                    break;
                case '*':
                    res = n1 * n2;
                    System.out.println(n1 + " * " + n2 + " = " + res);
                    break;
                case '/':
                    res = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + res);
                    break;
                default:
                    System.out.println("invalid operator");
            }


        }
    }


