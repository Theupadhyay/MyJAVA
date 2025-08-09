import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Fruit name ");
        String fruit = sc.nextLine();
        switch (fruit) {
            case "Mango" -> System.out.println("It is king of fruit");
            case "Apple" -> System.out.println("It is healthy fruit ");
            case "Grapes" -> System.out.println("It is small fruit ");
            case "Banana" -> System.out.println("It is yellow fruit ");
            default -> System.out.println("Invalid input");
        }
    }
}