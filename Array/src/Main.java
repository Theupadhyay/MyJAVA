import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] roll = new String[n];
        String[] names = new String[n];

        for (int i = 0; i < 5; i++) {
            System.out.println("enter roll" + (i + 1) + " : ");
            roll[i] = sc.nextLine();
            System.out.println("enter names" + (i + 1) + " : ");
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Roll no. " + roll[i] + " And name is " + names[i]);

        }
    }
}