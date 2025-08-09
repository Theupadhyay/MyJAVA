public class ArrUseRec {
    // Print Array using recursion
    static void printArr(int[] arr , int index){
        int n = arr.length;
        if(index == n ){
            return;
        }
        System.out.println(arr[index]+" ");
        printArr(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,8};
        printArr(arr,0);
    }
}
