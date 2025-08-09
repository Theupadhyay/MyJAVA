import java.util.Arrays;

public class SelectionSortt {
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min =  i ;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,8,9,3,4,2,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
