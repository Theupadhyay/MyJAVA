//83. Write a Java program to multiply the corresponding
// elements of two integer arrays.
//        Sample Output:
//        Array1: [1, 3, -5, 4]
//        Array2: [1, 4, -5, -2]
//        Result: 1 12 25 -8

import java.util.Arrays;

public class Practice33 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, -5, 4};
        int[] arr2 = {1, 4, -5, -2};
        int[] arr3 = {arr1[0] * arr2[0], arr1[1] * arr2[1], arr1[2] * arr2[2], arr1[3] * arr2[3]};
        System.out.println("The New array is : "+ Arrays.toString(arr3));
    }
}
