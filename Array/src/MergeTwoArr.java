import java.util.Arrays;

public class MergeTwoArr {
    public static void main(String[] args) {
        int m =3,n= 3;
        int[] arr = {1,2,3};
        int[] arr1 = {4,5,6};
        int s = m+n;
        int[] merged = new int[s];
        for (int i = 0; i <m ; i++) {
            merged[i] =arr[i];
        }
        for (int i = m; i<s ; i++) {
            merged[i] =arr1[i-m];
        }
        System.out.println(Arrays.toString(merged));
    }
}
