package Sliding_Window;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i]; // add new element

            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[i - (k - 1)]; // remove old element
            }
        }

        System.out.println(maxSum); // Output: 9
    }
}
