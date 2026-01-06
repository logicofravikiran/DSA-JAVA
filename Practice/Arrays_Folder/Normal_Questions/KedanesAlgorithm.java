package Arrays_Folder.Normal_Questions;

import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int pointer2 = 0;
        int temp = 0;
        // for (int i = 0; i < nums1.length; i++) {
        // System.out.println(i + "th iteration");
        // if (nums1[i] > nums2[pointer2]) {
        // temp = nums1[i];
        // nums1[i] = nums2[pointer2];
        // if (pointer2 < nums2.length - 1) {
        // pointer2++;
        // }
        // System.out.println("in IF--");
        // if (i < nums1.length - 1) {
        // nums1[i + 1] = temp;
        // System.out.println("\t in if");
        // System.out.println(Arrays.toString(nums1));
        // }
        // } else if (nums1[i] == 0) {
        // nums1[i] = nums2[pointer2];
        // pointer2++;
        // System.out.println("in else");
        // }
        // System.out.println(Arrays.toString(nums1));
        // System.out.println("-------------------");
        // }
        int i = 0;
        while (pointer2 < n
                || i < nums1.length) {
            if (nums1[i] > nums2[pointer2]) {
                temp = nums1[i];
                nums1[i] = nums2[pointer2];
                System.out.println("in IF--");
                if (i < nums1.length - 1) {
                    nums1[i + 1] = temp;
                    System.out.println("\t in if");
                    System.out.println(Arrays.toString(nums1));
                }
            } else if (nums1[i] == 0) {
                nums1[i] = nums2[pointer2];
                pointer2++;
                System.out.println("in else");
            }
            i++;

            System.out.println(Arrays.toString(nums1));
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 0 };
        int m = 1;
        int[] nums2 = { 1 };
        int n = 1;
        merge(nums1, m, nums2, n);
    }
}
