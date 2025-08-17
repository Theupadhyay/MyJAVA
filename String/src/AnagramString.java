import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        char[] a1 = a.toCharArray();
        char[] a2 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1,a2) ? "yes" : "No");
    }
}
