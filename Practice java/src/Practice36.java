public class Practice36 {
    //Fibonacci number '
    static void fibo(int n ){
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);
        int sum =0;
        for (int i = 0; i <n -2; i++) {
            sum = a + b;
            System.out.println(sum);
            a=b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        fibo(10);
    }
}
