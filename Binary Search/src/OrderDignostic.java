public class OrderDignostic {
    static int binarySearch(int[] arr, int target ){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]< arr[end];

        while(start<= end){
//            int mid = (start+end)/2;  // if its exeed the range of int for that we do the next line
            int mid = start + (end - start)/ 2;
            if(arr[mid]== target){
                return mid;
            }
           if(isAsc){
               if(target < arr[mid]){
                   end = mid -1;
               } else{
                   start = mid +1 ;
               }
           }else{
               if(target > arr[mid]){
                   end = mid -1;
               } else{
                   start = mid +1 ;
               }
           }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={12,9,8,7,6,5,4,3,2,1};
        int target = 12;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
}
