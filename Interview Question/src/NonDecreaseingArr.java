import java.util.* ;
public class NonDecreaseingArr {

        public static boolean isPossible(int[] arr, int n) {
            if (n <= 1) {
                return true;
            }

            int count = 0;

            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    count++;

                    if (count > 1) {
                        return false;
                    }

                    if (i == 1 || arr[i] >= arr[i - 2]) {
                        arr[i - 1] = arr[i];
                    } else {
                        arr[i] = arr[i - 1];
                    }
                }
            }

            return true;
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
                System.out.println(isPossible(arr, n));
            }
            sc.close();
        }
}


