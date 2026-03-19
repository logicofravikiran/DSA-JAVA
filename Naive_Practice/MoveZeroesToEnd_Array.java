package Naive_Practice;

import java.util.Arrays;

public class MoveZeroesToEnd_Array {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        System.out.println(Arrays.toString(moveZeroesToEndOfArray(arr)));
    }

    private static int[] moveZeroesToEndOfArray(int[] arr) {
        // ! Logic 1
        int count = 0;
        int temp = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // count++;
        // if (arr[i] == 0) {
        // temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }
        // System.out.println(count);

        // !Logic 2

        int index = 0;
        int p = 1;
        while (index < arr.length && p < arr.length) {
            count++;
            if (arr[p] != 0) {
                temp = arr[index];
                arr[index] = arr[p];
                arr[p] = temp;
                index++;
            }
            p++;
        }
        System.out.println(count);
        return arr;
    }
}
