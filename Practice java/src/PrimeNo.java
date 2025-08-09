public class PrimeNo {
    static boolean prime(int n ){
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i < n ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i <= n; i++) {
            if (prime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
