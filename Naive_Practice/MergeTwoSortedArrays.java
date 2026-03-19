package Naive_Practice;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 6, 7, 8, 9 };
        int[] arr2 = { 2, 4, 5, 10 };

        int p1 = 0;
        int p2 = 0;
        int[] result = new int[arr1.length + arr2.length];
        // int index = 0;

        // while (p1 < arr1.length && p2 < arr2.length) {
        // System.out.println(Arrays.toString(result));
        // if (arr1[p1] <= arr2[p2]) {
        // result[index] = arr1[p1];
        // p1++;
        // } else if (arr1[p1] > arr2[p2]) {
        // result[index] = arr2[p2];
        // p2++;
        // }

        // index++;
        // }
        // int[] arr1 = { 1, 3, 5, 6, 7, 8, 9 };
        // int[] arr2 = { 2, 4, 5, 10 };

        boolean isTakenLast = false;
        for (int index = 0; index < result.length; index++) {
            System.out.println(Arrays.toString(result));
            System.out.println("Now comparing:- " + arr1[p1] + " & " + arr2[p2]);
            if (arr1[p1] <= arr2[p2]) {
                result[index] = arr1[p1];
                if (p1 != arr1.length - 1) {
                    p1++;
                }
            } else if (arr1[p1] > arr2[p2]) {
                result[index] = arr2[p2];
                if (p2 != arr2.length - 1) {
                    p2++;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
