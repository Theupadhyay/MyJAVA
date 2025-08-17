import java.util.Arrays;

public class RemoveDup {
    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 6, 9, 8, 8, 9, 2};
        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];
        System.out.println("Sorted Array with non Duplicates : ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
