import java.util.Arrays;

public class AssignCookies {
    public static int assignCookies(int[] child, int[] cookies) {
        Arrays.sort(child);
        Arrays.sort(cookies);

        int i =0 , j =0;
        while (i < child.length && j < cookies.length) {
            if (cookies[j] >= child[i]) {
                i++;
            }
            j++;
        }
        return i;
    }
    public static void main(String[] args) {
        int[] child = {1, 2, 3};
        int[] cookies = {1, 2, 3};
    }
}
