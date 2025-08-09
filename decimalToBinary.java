import java.util.*;

public class decimalToBinary {
    public static void main(String[] args) {
        int num, i = 0;
        int binary[] = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary no : ");
        num = sc.nextInt();

        while (num != 0) {
            binary[i] = num % 2;
            num = num / 2;
            i++;
        }
        System.out.print("Binary value is : ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print("" + binary[j]);
        }
    }

}
