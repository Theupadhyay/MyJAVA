import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        System.out.println(str);

//        for (int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(i));
//        }
//        String s1 = "abhi";
//        String s2 = "uapdhyay";
//        if(s1.compareTo(s2) ==0){
//            System.out.println(" String are equal ");
//        }else System.out.println("String are not equal");

        String name = str.substring(9, str.length()); // last idex is exclusive str.length -1
        System.out.println(name + " it is a sub string ");
    }
}