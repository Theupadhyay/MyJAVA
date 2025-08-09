public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length()-1;
        while(s.charAt(i)==' ' && i>=0) {
            i--;
        }
        while(i>=0 && s.charAt(i)!=' ' ) {
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "My name is Abhishek upadhyay";
        System.out.println(lengthOfLastWord(str));
    }
}
