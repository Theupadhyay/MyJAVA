public class Practice37 {
    // Palindrome Program
    static boolean Palindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while (start<end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome("abcaba"));
    }
}
