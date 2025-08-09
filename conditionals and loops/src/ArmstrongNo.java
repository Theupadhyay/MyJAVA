public class ArmstrongNo {
    public static void main(String[] args) {
        for(int i =100; i<= 500; i++){
            int sum = 0;
            int n = i;
            while(n!=0){
                sum+= (n%10) *(n%10)*(n%10);
                n= n/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
