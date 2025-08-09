public class Print1to5 {
    static void Print(int n ){
        if (n == 0){
            return;
        }
        System.out.println(n);
        Print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Print(5);
    }
}
