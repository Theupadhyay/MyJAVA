public class PrintDecreasing {
    static  void Printdec(int a , int b ){
        if(a == b+1){
            return;
        }
        Printdec(a+1,b);
        System.out.println(a);
    }
    public static void main(String[] args) {
        Printdec(0,5);
    }
}
