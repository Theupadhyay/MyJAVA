public class rotateArrRecursion {

    public static  void rotateArr(int[] arr ,int k){
        k %= arr.length;
        int n = arr.length;
        swap(arr,0,n-1);
        swap(arr,0,k-1);
        swap(arr,k,n-1);
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;

    }
}
