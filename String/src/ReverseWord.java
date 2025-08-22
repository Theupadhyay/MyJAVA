public class ReverseWord {
    public static String reverseWord(String string) {
        String[] words = string.trim().split("\\s+");
        String str = "";
        for (int i = words.length-1; i >= 0; i--) {
            str += words[i] + " ";
        }
        return str.trim();
    }
    public static void main(String[] args) {
        String string = "Abhishek Upadhyay is a good person";
        System.out.println(reverseWord(string));
    }
}
