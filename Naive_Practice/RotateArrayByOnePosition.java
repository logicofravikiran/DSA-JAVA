package Naive_Practice;

import java.util.Arrays;

public class RotateArrayByOnePosition {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(rotatedArray(arr)));
    }

    private static int[] rotatedArray(int[] arr) {
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
            if (i == arr.length - 1) {
                arr[i] = first;
            }
        }

        return arr;
    }
}
