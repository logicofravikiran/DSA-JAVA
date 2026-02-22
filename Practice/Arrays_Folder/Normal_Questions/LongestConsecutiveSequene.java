package Arrays_Folder.Normal_Questions;

import java.util.Arrays;

public class LongestConsecutiveSequene {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 7, 2, 5, 8, 10, 6, 0, 1 };
        Arrays.sort(arr);
        System.out.println(longestCosecutiveSequenceLength(arr));
    }

    private static int longestCosecutiveSequenceLength(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else if (arr[i] + 1 != arr[i - 1] || arr[i] != arr[i - 1]) {
                count = 1;
            }
        }
        return maxCount;
    }
}