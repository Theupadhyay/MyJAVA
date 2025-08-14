public class LengthOfLastWord {
    public static int lengthOfWord(String string) {
        String str = string.trim();
        int count = 0;
        for (int i = str.length() - 1; i > 0; i--) {
            if(str.charAt(i) != ' '){
                count++;
            }else break;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfWord("Abhishek Upadhyay "));
    }
}
