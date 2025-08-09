public class Power {
    static int cal(int a, int b  ){
        if(b==0){
            return 1;
        }
        return a*cal(a,b-1);
    }
    public static void main(String[] args) {
        System.out.println(cal(2,3));
    }
}
