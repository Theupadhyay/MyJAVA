//Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
//Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.
//
//(*>#): positive integer
//(#>*): negative integer
//(#=*): 0
//Example 1:
//Input 1:
//
//###***   -> Value of S
//Output :
//
//0   → number of * and # are equal

import java.util.Scanner;

public class CountHashStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countS = 0;
        int countH = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '*'){
                countS++;
            } else if (str.charAt(i)== '#') {
                countH++;
            }
        }
        int diff = countS - countH;
        System.out.println(diff);
    }
}
