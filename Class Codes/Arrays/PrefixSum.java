package Core2web.Arrays;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 8, 9 };
        // int[] prefixSumArr = new int[arr.length];

        // prefixSumArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];

        }
        System.out.println(Arrays.toString(arr));
    }
}
