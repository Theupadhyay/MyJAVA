public class DigitSum {
    static int digitSum(int n ){
        if (n == 0){
            return 0;
        }
        int x = n%10;
        return x + digitSum(n/10)  ;
    }

    public static void main(String[] args) {
        System.out.println(digitSum(123));
    }
}
