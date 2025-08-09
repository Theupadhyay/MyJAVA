import java.util.Arrays;
public class SecondOrder {

        public static int[] getSecondOrderElements(int n, int []a) {
            // Write your code here.
            int[] arr2 = new int[2];

            // Sort the array
            Arrays.sort(a);

            // Get the largest element (last element in the sorted array)
            arr2[0] = a[n-1];

            // Get the second smallest element (second element in the sorted array)
            arr2[1] = a[1];

            return arr2;
        }

        public static void main(String[] args) {
            int[] array = {5, 3, 8, 4, 2, 7, 1, 10, 6, 9};
            int n = array.length;

            int[] result = getSecondOrderElements(n, array);
            System.out.println("Largest element: " + result[0]);
            System.out.println("Second smallest element: " + result[1]);
        }


}
