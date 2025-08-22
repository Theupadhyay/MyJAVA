import java.util.Arrays;

public class Merge2SortedArrWithoutExSapace {
    public static void mergeArr(int[] arr1 , int m , int[] arr2 , int n){
        int i = m-1 , j = n-1 , k = m+n-1;
        while (i >= 0 && j >= 0) {
            arr1[k--] = (arr1[i] > arr2[j]) ? arr1[i--] : arr2[j--];
        }
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = new int[6]; // total size = m + n
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        int m = 3;

        int[] nums2 = {4, 5, 6};
        int n = nums2.length;

        mergeArr(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 3, 4, 5, 6]
    }

}
