public class SecondLargestSalary {
    public static int secLargest(int[] arr) {
        int largest =0;
        int sLar =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                sLar = largest;
                largest = arr[i];
            }else if(arr[i] > sLar && arr[i] != largest){
                sLar = arr[i];
            }
        }
        return sLar;
    }
    public static void main(String[] args) {
        int[] arr = {75000,35000,40000,20000};
        System.out.println(secLargest(arr));
    }
}
