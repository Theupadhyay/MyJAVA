import java.util.Arrays;

public class MergeSortCustom {

    static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            mix[k++] = arr[i++];
        }

        while (j <= end) {
            mix[k++] = arr[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }

    public static void main() {

    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 5, 7, 1, 4};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
