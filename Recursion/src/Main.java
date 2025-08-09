public class Main {
    static void PrintInc(int a, int b) {
//        if (a == b + 1) {
//            return;
//        }
//        System.out.println(a);
//        PrintInc(a + 1, b);
        if (a==5){
            System.out.println(5);
            return;
        }
        System.out.println(a);
        PrintInc(a+1,b);
    }

    public static void main(String[] args) {
        PrintInc(1, 5);
    }
}