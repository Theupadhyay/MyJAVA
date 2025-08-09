import java.util.Arrays;

public class MergeSorArr {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] MerArr = new int[nums1.length + nums2.length];
        int pos = 0;
        for (int element : nums1) {
            MerArr[pos]= element;
            pos++;
        }
        for (int element : nums2) {
            MerArr[pos]= element;
            pos++;
        }
        System.out.println(Arrays.toString(MerArr));
//        for (int j = 0, i = m; j < n; j++) {
//            nums1[i] = nums2[j];
//            i++;
//        }
//        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int n = nums1.length;
        int[] nums2 = {4,5,6};
        int m = nums2.length;
        merge(nums1,n,nums2,m);
    }
}
