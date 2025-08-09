public class RotatedSortedArray {
    static int search(int[] arr , int target){
        int n = arr.length;
        int si = 0;
        int ei = n-1;
        while(si<=ei){
            int mid=  si +(ei -si)/2;
            if (arr[mid] == target){
                return mid;
            }
            if(arr[si]<=arr[mid]){
                if(target>=arr[si]&&target<arr[mid]){
                    ei = mid-1;
                }else {
                    si = mid +1;
                }
            } else {
                if(arr[mid]<target&& target<=arr[ei]){
                    si = mid+1;
                }else {
                    ei = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,0,1,2,3,4};
        int target = 0;
        System.out.println(search(arr,target));
    }
}
