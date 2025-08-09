public class FindMaxUseRec {
    static int  macValue(int[] arr , int index){
        if (index==arr.length-1){
            return arr[index];
        }
        return Math.max(macValue(arr,index+1),arr[index]);
    }
    public static void main(String[] args) {
        int[]  arr = { 2,6,8,7,4,9};
        System.out.println(macValue(arr,0));
    }
}
