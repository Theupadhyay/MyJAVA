//80. Write a Java program to get the largest value between the first and last elements of an array (length 3) of integers.
//        Sample Output:
//
//        Original Array: [20, 30, 40]
//        Larger value between first and last element: 40

public class Practice31 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
