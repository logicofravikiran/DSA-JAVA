package DSA250.Array.Easy;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 1, 0, 12 };
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }

    private static int[] moveZeroes(int[] arr) {

        int temp = 0;
        int index = 0;
        int p = 1;

        while (index < arr.length && p < arr.length) {
            System.out.println(Arrays.toString(arr));
            if (arr[p] != 0) {
                temp = arr[p];
                arr[p] = arr[index];
                arr[index] = temp;
                index++;
            }
            p++;
        }
        return arr;
    }
}
