public class FindFactorial {
    static  int  findFac(int a ){
        if (a<=1){
            return 1;
        }
        return findFac(a-1)*a;
    }
    static  int sumOfN(int n ){
        if (n <= 1) {
            return 1;
        }
        return n+ sumOfN(n-1);
    }
    public static void main(String[] args) {
        System.out.println(findFac(5));
        System.out.println(sumOfN(5));
    }
}
