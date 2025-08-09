public class SquareRoot {
        public static int mySqrt(int x) {
            if(x<= 1){
                return x; // edge case
            }
            int start = 0;
            int end = (x/2)+1;
            int sqRoot = 0;
            long mid = 0;
            // Pandit Bolte (upadhyay)
            while (start <= end){
                mid = start + (end- start)/2;
                if(mid*mid == x){
                    return (int) mid;
                }else if (mid*mid < x){
                    start = (int) mid +1;
                    sqRoot = (int) mid;
                }else{
                    end = (int) mid -1;
                }
            }
            return sqRoot;
        }
    public static void main(String[] args) {
        System.out.println(mySqrt(16));
    }
}
