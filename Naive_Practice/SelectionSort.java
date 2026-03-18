package Naive_Practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 56, 5, 4, 3, 2, 1 };

        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                if (j == arr.length - 1) {
                    temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
