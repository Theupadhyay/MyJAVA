import java.util.Arrays;

public class MismatchedSet {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] { arr[index], index + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(int[] args) {
        MismatchedSet mismatchedSet = new MismatchedSet();
        int[] arr = { 1, 9, 2, 1, 7, 4 };
        int[] result = mismatchedSet.findErrorNums(arr);
        System.out.println(Arrays.toString(result));
    }
}
