package Arrays_Folder.Normal_Questions;

import java.util.Arrays;

class RotateArray {
    // public static void main(String[] args) {
    // int arr[] = { 1, 23, 3, 4, 5 };
    // int k = 0;
    // arr = rotatedArray(k, arr);
    // System.out.println(Arrays.toString(arr));
    // }

    // public static int[] rotatedArray(int k, int[] arr) {
    // int[] arr2 = new int[arr.length];

    // for (int i = 0; i < arr2.length; i++) {

    // if ((i + k) < arr.length) {
    // arr2[i] = arr[i + k];
    // }
    // }
    // arr = arr2;
    // return arr;
    // }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] rotatedArray = rotatedArrayResult(arr);
        System.out.println(Arrays.toString(rotatedArray));
    }

    static int[] rotatedArrayResult(int[] arr) {
        int temp = arr[0];
        int count = 3;
        for (int i = 1; i <= arr.length; i++) {
            if (i == arr.length) {
                arr[i - 1] = temp; // 2 3 4
            } else {
                arr[i - 1] = arr[i];

            }

            if (i == arr.length && count >= 1) {
                System.out.println("Started again");
                count--;
                i = 1;
                temp = arr[i];
            }
        }
        return arr;
    }
}