package ClassCodes.Arrays;

import java.util.*;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] arr1 = { 5, 6, 7, 8, 9, 5 };
        int[] arr2 = { 1, 2, 6, 8 };

        System.out.println(countDistinctElements(arr1, arr2));
    }

    private static int countDistinctElements(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        int index = 0;
        int j = 0;
        boolean isFirstArray = true;
        while (index < arr1.length + arr2.length) {
            if (isFirstArray) {
                if (!set.contains(arr1[j]) && j < arr1.length) {
                    set.add(arr1[j]);
                }
            } else {
                if (!set.contains(arr2[j]) && j < arr2.length) {
                    set.add(arr2[j]);
                }
            }
            if (j == arr1.length - 1) {
                isFirstArray = false;
                j = -1;
            }
            index++;
            j++;
        }
        return set.size();
    }
}
