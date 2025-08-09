import java.util.Arrays;

public class RowColMatrix {
    static  int[] search(int[][]  matrix , int target){
        int row = 0;
        int col = matrix.length -1;
         while(row< matrix.length && col >=0){
         if(matrix[row][col] ==  target){
             return new int[]{row,col};
         }
         if (matrix[row][col] < target){
             row ++;
         }else{
             col--;
         }
         }
         return new int[]{-1,-1};
    }
    public static void main(String[] args) {
    int[][] arr ={
            {2,5,7,9},
            {3,6,10,12},
            {4,8,13,20},
            {11,14,15,30}
    };
        System.out.println(Arrays.toString(search(arr, 20)));
    }
}
