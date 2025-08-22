import java.util.Arrays;

public class MejorityElement {
    public static int mejorityEle(int[] arr) {
        int candidate = 0;
        int vote = 0;

        for (int i : arr) {
            if (vote == 0) {
                candidate = i;
            }
            vote += (i == candidate) ? 1 : -1;
        }

        return candidate;


//        int maxCount =0;
//        int maxE=0;
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//                    count++;
//                    if(count > maxCount){
//                        maxCount = count;
//                        maxE = arr[i];
//                    }
//                }
//            }
//        }
//        return maxE;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(mejorityEle(arr));
    }
}
