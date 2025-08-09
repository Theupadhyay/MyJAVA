//Write a Java program to count letters, spaces, numbers and other characters in an input string.
//        Expected Output
//
//        The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
//        letter: 23
//        space: 9
//        number: 10
//        other: 6

import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        char[] x = sc.nextLine().toCharArray();
        int number = 0;
        int letters = 0;
        int spaces = 0;
        int others = 0;
        for (int i = 0; i < x.length; i++) {
            if(Character.isLetter(x[i])){
                letters++;
            }
            else if(Character.isSpaceChar(x[i])){
                spaces++;
            }
            else if(Character.isDigit(x[i])){
                number++;
            }else{
                others++;
            }
        }
        System.out.println("Number are : " + number);
        System.out.println("letter are : " + letters);
        System.out.println("Spaces are : " + spaces);
        System.out.println("Others are : " + others);
    }
}