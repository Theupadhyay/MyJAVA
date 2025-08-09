import java.util.Arrays;

public class RemoveElement {
    public static int[] removeEle(int[] arr, int remove) {
        int[] result = new int[arr.length -1];
        int j =0 ;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != remove) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 3, 2};
        int remove = 5 ;
        System.out.println(Arrays.toString(removeEle(arr,remove)));
    }
}
