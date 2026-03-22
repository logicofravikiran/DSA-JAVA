package DSA250.Array.Easy;

import java.util.Arrays;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        System.out.println(Arrays.toString(intersectionOfTwoArrays(nums1, nums2)));
    }

    private static int[] intersectionOfTwoArrays(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;

        int length = Math.max(nums1.length, nums2.length);
        int[] result = new int[length];

        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[index] = nums1[i];
                }
            }
        }
        return result;
    }
}
