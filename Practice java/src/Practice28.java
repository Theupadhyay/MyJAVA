//77. Write a Java program to create an array of length 2 from two integer arrays with three elements. The newly created array will contain the first and last elements from the two arrays.
//        Test Data: array1 = 50, -20, 0
//        array2 = 5, -50, 10
//        Sample Output:
//
//        Array1: [50, -20, 0]
//        Array2: [5, -50, 10]
//        New Array: [50, 10]

import java.util.Arrays;

public class Practice28 {
    public static void main(String[] args) {
    int[] arr1 = {50 , 40 ,30};
    int[] arr2 = {84, 65, 10};
    int[] arr3 = {arr1[0], arr2[arr2.length -1]};
        System.out.println(Arrays.toString(arr3));
    }
}
