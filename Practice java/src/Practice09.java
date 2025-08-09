import java.util.Scanner;

//Write a Java program to convert a string to an integer.
public class Practice09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value : ");
        String str = sc.nextLine();
        int dec = Integer.parseInt(str);
        System.out.println("Interger value is : "+ dec);
    }
}
