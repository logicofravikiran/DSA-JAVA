package CompanyWise.IBM;

import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 3, 4, 5, 5, 5, 6 };
        System.out.println(uniqueElements(arr));
    }

    private static int uniqueElements(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));

        return i + 1;
    }
}
