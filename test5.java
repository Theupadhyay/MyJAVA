//Quiz day 1 
// what will be the output when you call test(5)?
//Ans = 0 1 2 3 4 5 

public class test5 {
    public static void test(int n) {
        if (n > 0) {
            test(n - 1);
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        test(5);
    }

}
