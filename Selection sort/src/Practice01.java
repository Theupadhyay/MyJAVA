import java.util.Arrays;

public class Practice01 {
    static void Selction(int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int j = start; j <= end ; j++) {
            if (arr[max]<arr[j]){
                max = j;
            }
        }
        return max;
    }

    static void swap(int[] arr, int start , int last){
        int temp = arr[start];
        arr[start]= arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,9,6};
        Selction(arr);
        System.out.println(Arrays.toString(arr));

    }
}
