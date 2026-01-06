package Situational;

import java.util.*;

public class BookReadingProblem3 {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 3, 1 };
        int len = arr.length;
        int hours = 7;
        System.out.println(maxBooksNum(arr, len, hours));
    }

    static int maxBooksNum(int[] arr, int len, int hours) {
        int maxBookNum = 0;
        Arrays.sort(arr);
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= hours) {
                sum += arr[i];
                maxBookNum++;
            }
        }

        return maxBookNum;
    }
}
