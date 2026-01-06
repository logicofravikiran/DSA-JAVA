package Situational;

import java.util.*;

public class MinSum1 {
    public static void main(String[] args) {
        int n = 3;
        int arr1[] = { 4, 1, 6 };
        int arr2[] = { 3, 1, 2 };

        System.out.println(minSum(n, arr1, arr2));
    }

    static int minSum(int n, int[] arr1, int[] arr2) {
        Arrays.sort(arr1);

        Integer[] ARR2 = new Integer[n];
        for (int i = 0; i < ARR2.length; i++) {
            ARR2[i] = arr2[i];
        }

        Arrays.sort(ARR2, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1[i] * ARR2[i];
        }
        return sum;
    }

}
