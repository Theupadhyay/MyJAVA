import java.util.Scanner;

public class MaxArrayVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];  // array of size n+1

        for (int i = 0; i <= n; i++) {
            arr[i*2] = arr[i];
            if((i*2)+1 <= n){
                arr[(i*2)+1] = arr[i] + arr[i+1];
            }

//            if (i == 0 || i == 1) {
//                arr[i] = i;
//            } else if (i % 2 == 0) {
//                arr[i] = arr[i / 2];
//            } else {
//                arr[i] = arr[i / 2] + arr[(i / 2) + 1];
//            }
        }

        // find max value in array
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }

        System.out.println(max);
        sc.close();
    }
}