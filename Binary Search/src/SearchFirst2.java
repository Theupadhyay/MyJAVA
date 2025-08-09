public class SearchFirst2 {
    static int binarySearch(int[] arr, int target ){
        int start = 0;
        int end = arr.length-1;

        while(start<= end){
//          int mid = (start+end)/2;  // if its exeed the range of int
            int mid = start + (end - start)/ 2;
           if (arr[mid] == target){
               if (mid - 1 >= 0 && arr[mid - 1] == target) {  // for last accurance of 2 mid+1<arr.length-1 && arr[mid+1]
                   end = mid - 1;
               } else {
                   return mid;
               }
           } else if (arr[mid] > target) {
               end = mid -1;
           }else {
               start = mid +1;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={-18,-15,-2,2,2,7,8,12,15,22,25,34,65};
        int target = 2;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
}
