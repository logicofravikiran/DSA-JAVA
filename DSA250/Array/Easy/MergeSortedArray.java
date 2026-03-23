package DSA250.Array.Easy;

import java.util.Arrays;

//Leetcode 88
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 4, 5, 6, 0, 0, 0 }; // {4,5,6,0,0,0}
        int[] nums2 = { 1, 2, 3 }; // {1,2,3}

        System.out.println(Arrays.toString(mergeSortedArray(nums1, nums2)));
    }

    private static int[] mergeSortedArray(int[] nums1, int[] nums2) {

        int p1 = nums2.length - 1;
        int p2 = nums2.length - 1;
        int index = nums1.length - 1;

        while (index >= 0 && p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[index] = nums1[p1];
                nums1[p1] = 0;
                if (p1 != 0) {
                    p1--;
                }
            } else if (nums1[p1] < nums2[p2]) {
                nums1[index] = nums2[p2];
                p2--;
            }

            index--;

            System.out.println(Arrays.toString(nums1));
            System.out.println("p1:- " + p1 + ", p2:- " + p2);
        }

        // for (int i = p2; i >= 0; i--) {
        // for (int j = p2; j > 0; j--) {
        // System.out.println("i:- " + i + ", j:- " + j);
        // System.out.println(Arrays.toString(nums1));
        // if (nums1[i] < nums2[j]) {
        // nums1[index] = nums2[j];
        // if (index > 0) {

        // index--;
        // }
        // p2--;
        // } else if (nums1[i] > nums2[j]) {
        // nums1[index] = nums1[i];
        // index--;
        // nums1[i] = 0;
        // if (i == 0) {
        // i = nums2.length - 1;
        // }
        // break;
        // }
        // }
        // System.out.println("------------------");
        // }
        return nums1;
    }
}
