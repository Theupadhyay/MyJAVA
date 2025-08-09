import java.util.* ;


public class EquilibriumIndex {


        public static int arrayEquilibriumIndex(int[] arr) {
            int totalSum = 0;
            for (int num : arr) {
                totalSum += num;
            }

            int leftSum = 0;
            for (int i = 0; i < arr.length; i++) {
                totalSum -= arr[i];  // now totalSum is rightSum for index i

                if (leftSum == totalSum) {
                    return i;
                }

                leftSum += arr[i];
            }

            return -1;  // no equilibrium index found
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();  // number of test cases
            while (t-- > 0) {
                int n = sc.nextInt();  // size of array
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(arrayEquilibriumIndex(arr));
            }
            sc.close();
        }


}
