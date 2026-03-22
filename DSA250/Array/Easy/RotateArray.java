package DSA250.Array.Easy;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        System.out.println(Arrays.toString(rotatedArray(arr, k)));
    }

    private static int[] rotatedArray(int[] arr, int k) {

        // ! logic 1 (giving TLE on Leetcode)
        k = k % arr.length;
        // int temp = 0;
        // for (int i = 0; i < k; i++) {
        // temp = arr[0];
        // for (int j = 0; j < arr.length - 1; j++) {
        // arr[j] = arr[j + 1];
        // }
        // arr[arr.length - 1] = temp;
        // }

        // ! Logic 2

        int[] supporter = new int[k];

        for (int i = 0; i < supporter.length; i++) {
            supporter[i] = arr[arr.length - k + i];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i >= supporter.length) {
                arr[i] = arr[i - k];
            } else {
                arr[i] = supporter[i];
            }
        }

        System.out.println(Arrays.toString(supporter));

        return arr;
    }
}
