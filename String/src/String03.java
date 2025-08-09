import java.util.Arrays;

public class String03{

    static String LongestCommonPrefix(String[] str){
        int length = str.length;
        if (length == 0){
            return "";
        }
        if (length == 1) return str[0];
        Arrays.sort(str);

        int end = Math.min(str[0].length(), str[length-1].length());

        int i =0;
        while (i< end && str[0].charAt(i) == str[length-1].charAt(i)){
            i++;
        }

        String pre = str[0].substring(0,i);
        return pre;
    }
    public static void main(String[] args) {
        String[] str = {"geeksforgeeks", "geeks", "geek"};
        System.out.println("The longest Common prefix is : " +LongestCommonPrefix(str));
    }
}
