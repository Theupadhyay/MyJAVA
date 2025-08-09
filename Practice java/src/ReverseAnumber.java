public class ReverseAnumber {
    static int  reverse(int n ){
        int sum = 0;
        while (n!=0){
            int rem = n%10;
            sum = sum * 10 + rem;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1243));
    }
}
