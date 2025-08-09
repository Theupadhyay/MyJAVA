import java.lang.reflect.Array;
import java.util.Arrays;
public class searchIn2d {
//    static int[] search2d(int[][] arr, int target ){
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(arr[row][col]==target){
//                    return new int[]{row,col};
//                }
//            }
//        }
//        return new int[]{-1,-1};
        static int max(int[][] arr ){
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if(arr[row][col]> max){
                        max= arr[row][col];
                    }
                }
            }
    return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {45,65,88},
                {14,25,52,1},
                {2,3,4}
        };
        int target =4 ;
//        int[] ans = search2d(arr, target);
//        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
}
