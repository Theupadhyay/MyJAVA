import java.util.ArrayList;
import java.util.Collections;
public class RotateArrayList {


        public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
            // Ensure k is within the bounds of the list size
            int n = arr.size();
            k = k % n;

            // Rotate the list to the left by k positions
            Collections.rotate(arr, -k);

            return arr;
        }

        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);

            System.out.println("Original ArrayList: " + arr);

            int k = 2;
            ArrayList<Integer> result = rotateArray(arr, k);

            System.out.println("Rotated ArrayList: " + result); // Output: [3, 4, 5, 1, 2]
        }


}
