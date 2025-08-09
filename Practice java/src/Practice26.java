//74. Write a Java program to test if 10 appears as the first or last element of an array of integers.
// The array length must be broader than or equal to 2.
//        Sample Output:
//        Test Data: array = 10, -20, 0, 30, 40, 60, 10
//
//        true

public class Practice26 {
    public static void main(String[] args) {
        int[]  arr = {10,-20,0,30,25,60,43,10};
            if(arr.length > 0 && arr[0] == 10 && arr[arr.length - 1] == 10){
                System.out.println("true");
            }else {
                System.out.println("false");
        }
    }
}
