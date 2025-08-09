import java.util.Arrays;

public class MoveZeroAtLast {
    public static void moveZero(int[] arr){
        int i =0 ;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 7, 8, 0, 0, 2};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
