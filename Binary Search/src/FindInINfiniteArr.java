public class FindInINfiniteArr {
static int ans(int[] arr , int target){
    int start = 0;
    int end = 1;
    while (target>end){
        int newStart = end +1;
        end = end + (end - start+1)*2;
        start = newStart;
    }
    return binarySearch(arr,target,start,end);
}
static int binarySearch(int[] arr, int target, int start,int end){
    while (start<=end){
        int mid = start + (end - start)/2;

        if(target<arr[mid]){
            end = mid-1;
        } else if (target > arr[mid]) {
            start = mid +1;
        }else {
            return mid;
        }
    }
    return -1;
}

    public static void main(String[] args) {
        int[] arr={-18,-15,-2,1,6,7,8,12,15,22,25,34,65};
        int target = 12;
        System.out.println(ans(arr,target));

    }
}
