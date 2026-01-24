package Arrays_Folder.Normal_Questions;

import java.util.Arrays;

public class revArr {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 6, 7, 9, 4 };
        // int[] arr2 = { 3, 5, 2, 6, 7, 9 };
        System.out.println(Arrays.toString(reveArray(arr)));
    }

    static int[] reveArray(int[] arr) {
        int temp = 0;
        int end = arr.length;
        for (int i = 0; i < end / 2; i++) {
            temp = arr[i];
            arr[i] = arr[end - 1 - i];
            arr[end - 1 - i] = temp;
        }
        return arr;
    }
}
