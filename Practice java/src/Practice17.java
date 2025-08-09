//60. Write a Java program to find the penultimate (next to the last) word in a sentence.
//        Sample Output:
//
//        Input a String: The quick brown fox jumps over the lazy dog.
//        Penultimate word: lazy

import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String line = sc.nextLine();
        String[] word = line.split("[ ]+");
        System.out.println("Second last word is : "+ word[word.length - 2]);
    }
}
