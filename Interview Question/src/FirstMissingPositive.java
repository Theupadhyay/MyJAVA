import java.util.* ;
import java.io.*;
public class FirstMissingPositive {

        public static int firstMissing(int[] arr, int n) {
            for (int i = 0; i < n; i++) {
                while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                    // Swap arr[i] with arr[arr[i] - 1]
                    int temp = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = temp;
                }
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] != i + 1) {
                    return i + 1;
                }
            }

            return n + 1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(); // number of test cases
            while (t-- > 0) {
                int n = sc.nextInt(); // size of array
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(firstMissing(arr, n));
            }
            sc.close();
        }
    }

