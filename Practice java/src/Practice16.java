//58. Write a Java program to capitalize the first letter of each word in a sentence.
//        Sample Output:
//
//        Input a Sentence: the quick brown fox jumps over the lazy dog.
//        The Quick Brown Fox Jumps Over The Lazy Dog.

import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String line = sc.nextLine();
        String upperCaseLine = "";
        Scanner scanLine = new Scanner(line);

        while (scanLine.hasNext()){
            String word = scanLine.next();
            upperCaseLine += Character.toUpperCase(word.charAt(0)) +word.substring(1) + " ";
        }
        System.out.println(upperCaseLine.trim());
    }
}
