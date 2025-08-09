public class SearchInMountain {   // leetcode 1095
    int search(int[] arr,int target ){
       int peak = peakIndexInMountainArray(arr);
       int firstTry = orderDignostic(arr,target,0,peak);
               if(firstTry!=-1){
                   return firstTry;
               }
               return orderDignostic(arr,target,peak+1,arr.length-1);
    }
    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end =arr.length-1;

        while(start<end){
            int mid = start +(end - start)/2;

            if(arr[mid]>arr[mid+1]){
              end = mid;
            }else{
                start = mid +1;
            }
        }
        return start;
    }
    static int orderDignostic(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start]<arr[end];
        while (start<=end){
            int mid= start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start = mid+1;

                }
            }else{
                if(target>arr[mid]){
                    end = mid - 1;
                }else{
                    start=mid +1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
/*class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);

        int firstTry = orderDignostic(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        return orderDignostic(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    public int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int orderDignostic(MountainArray mountainArr, int target, int start, int end) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            }

            if (isAsc) {
                if (target < midValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // You can add test cases here if needed.
    }
}
*/
