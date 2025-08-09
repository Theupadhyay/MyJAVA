public class PrintEvenInc {
    static void Print(int a , int b ){
        if (a==b+1){
            return;
        }
        if(a%2==0){
            System.out.print(a+" ");
        }
        Print(a+1,b);
        if (a%2!=0){
            System.out.print(a+ " ");
        }
    }
    public static void main(String[] args) {
        Print(0,10);
    }
}
