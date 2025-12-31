import java.util.Scanner;

public class RemoveDigitOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char digit = sc.next().charAt(0);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == digit){
                String temp = input.substring(0,i) + input.substring(i+1);
                int val = Integer.parseInt(temp);
                if (val > max)  max = val;
            }
        }
        System.out.println(String.valueOf(max));
    }
}
