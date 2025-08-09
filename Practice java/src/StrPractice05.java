//Write a Java program to get the index of all the characters of the alphabet.
//
//        Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."

public class StrPractice05 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        int a = str.indexOf("a", 0);
        int g = str.indexOf("g", 0);
        int u = str.indexOf("u", 0);
        System.out.println("the Index of a "+ a );
        System.out.println("the Index of g "+ g );
        System.out.println("the Index of u "+ u );
    }
}
