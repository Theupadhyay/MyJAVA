
public class practice03 {

    static void pattern(int n){
        int num = 1;
        for (int i = 0; i <= n ; i++) {
            for (int space = 0; space < n - i ; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
 pattern(4);
    }
}
