package Naive_Practice;

import java.util.*;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6 };
        printDuplicates(arr);
        System.out.println("\n------------------------------");
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

    private static void printDuplicates(int[] arr) {
        int index = 0;
        int p = 1;
        // ! Logic 1
        Set<Integer> set = new HashSet<>();

        while (index < arr.length && p < arr.length) {
            // set.add(arr[index]);
            if (arr[index] == arr[p] && !set.contains(arr[p])) {
                set.add(arr[p]);
                System.out.print(arr[p] + "\t");
                index++;
            }
            if (p < arr.length - 1) {
                p++;
            } else {
                index++;
                p = index + 1;
            }
        }

        // ! Logic 2
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("\n" + duplicates);
    }

    private static int[] removeDuplicates(int[] arr) {

        int index = 0;
        int p = 1;
        int temp = 0;
        while (index < arr.length - 1 && p < arr.length) {
            System.out.println(Arrays.toString(arr));
            if (arr[p] != arr[index]) {
                index++;
                temp = arr[p];
                arr[p] = arr[index];
                arr[index] = temp;
            }
            if (p < arr.length) {
                p++;
            }
        }
        System.out.println("index" + index);
        int[] result = new int[index + 1];

        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}
