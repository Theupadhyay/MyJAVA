public class MergeTwoStrAlternately {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqr";
        int m = s1.length();
        int n = s2.length();

        int i = 0, j = 0;
        StringBuilder str = new StringBuilder();

        while (i < m || j < n) {
            if (i < m) {
                str.append(s1.charAt(i++));
            }
            if (j < n) {
                str.append(s2.charAt(j++));
            }
        }
        System.out.println(str.toString());
    }
}
