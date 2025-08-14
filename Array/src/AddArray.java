import java.util.Arrays;

public class AddArray {
    public static void main(String[] args) {
        int[] array1 = {9, 1, 2, 3};
        int[] array2 = {4, 5, 6, 8};

        int[] sumArray = new int[array1.length + 1];

        int i = array1.length - 1;
        int j = array2.length - 1;
        int k = sumArray.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += array1[i];
            }
            if (j >= 0) {
                sum += array2[j];
            }
//            int maxSize = Math.max();
            carry = sum / 10;
            sumArray[k] = sum % 10;

            i--;
            j--;
            k--;
        }

        if (carry > 0) {
            sumArray[k] = carry;
        }

        for (int element : sumArray) {
            System.out.print(" " + element);
        }
    }
}

//import java.util.Arrays;

//public class AddArray {
//    public static void main(String[] args) {
//        int[] arr1 = {9, 9, 2, 3, 4};
//        int[] arr2 = {9, 2, 3, 4, 5};
//        int maxSize = Math.max(arr1.length, arr2.length);
//        int[] arr3 = new int[maxSize + 1];
//        int carry = 0;
//
//        for (int i = arr3.length - 1; i >= 0; i--) {
//            int sum = carry + (i < arr1.length ? arr1[i] : 0) + (i < arr2.length ? arr2[i] : 0);
//            arr3[i] = sum % 10;
//            carry = sum / 10;
//        }
//
//        System.out.println(Arrays.toString(arr3));
//    }
//}

