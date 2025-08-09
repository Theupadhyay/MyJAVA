import java.util.Arrays;

public class RemoveDupSorArr {
    private static int[] removeDupEle(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0]; // Handle edge cases
        }

        int j = 0; // Pointer for unique elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // Copy the unique portion to a new array of the correct size
        return Arrays.copyOfRange(arr, 0, j + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 6, 6, 7};
        System.out.println(Arrays.toString(removeDupEle(arr)));
    }
}


/*
import java.util.Arrays;

public class RemoveDupSorArr {
    private static int[] removeDupEle(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0]; // Handle edge cases
        }

        int[] result = new int[arr.length];
        int j = 1;
        result[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result[j] = arr[i];
                j++;
            }
        }

        // Return only the portion of the array with unique elements
        return Arrays.copyOf(result, j);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 6, 6, 7};
        System.out.println(Arrays.toString(removeDupEle(arr)));
    }
}

 */