//78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
//        Sample Output:
//
//        Original Array: [5, 7]
//        true

public class Practice29 {
    static boolean check(int[] array){
        for (int i = 0; i < array.length-1 ; i++) {
            if (array[i]==4 ||array[i]==7){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 4,7};
        System.out.println(check(arr));
    }
}
