public class FiboSeries {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i < n ; i++) {
            System.out.println(fibonacii(i));
        }
    }

    private static int fibonacii(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacii(n - 2) + fibonacii(n - 1);
    }
}
