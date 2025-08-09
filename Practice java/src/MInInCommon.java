import java.util.Arrays;

public class MInInCommon {
    static public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int n = nums1.length;
        int m = nums2.length;

        while (i < n && j < m) {
            if (nums1[i] == nums2[j])
                return nums1[i];
            else if (nums1[i] > nums2[j])
                j++;
            else
                i++;
        }

        return -1;
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int m = Integer.MAX_VALUE;
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j]) {
//                    m = Math.min(m,nums1[i]);
//                    break;
//                }
//            }
//        }
//        return m;
    }
}
