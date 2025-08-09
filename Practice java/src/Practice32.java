//81. Write a Java program to swap the first and last elements of an array
// (length must be at least 1) and create another array.
//        Sample Output:
//
//        Original Array: [20, 30, 40]
//        New array after swaping the first and last elements: [40, 30, 20]

import java.util.Arrays;

public class Practice32 {
    public static void main(String[] args) {
        int[] arr= {10,20,30};
        int[] arrNew = {};
        int temp ;
        temp = arr[0];
        arr[0] = arr[2];
        arr[2]= temp;
        arrNew = new int[]{arr[0], arr[1], arr[2]};
        System.out.println(Arrays.toString(arrNew));
    }
}
