public class envenDigit {
    static int findnum(int[] nums){
        int count = 0 ;
        for(int num : nums){
            if(even(num)){
                count++;
            }

        }
        return count;
    }
    static boolean even(int num){
    int numOfDigits = digit(num);
    /*if(numOfDigits%2 == 0){
            return true;
        }
        return false;
    */
        return numOfDigits % 2 == 0;
    }
    static int digit(int num ){
        int count = 0;
        while(num> 0){
            count++;
            num = num/10;
        }
        return count; 
    }
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findnum(nums));
    }
}
