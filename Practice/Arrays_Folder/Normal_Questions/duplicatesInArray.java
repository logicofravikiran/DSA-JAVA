package Arrays_Folder.Normal_Questions;

import java.util.Arrays;

public class duplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
        // System.out.println(Arrays.toString(resultedArr(arr)));
    }

    public static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            System.out.println(Arrays.toString(arr));
        }
        return i + 1;
    }

}
