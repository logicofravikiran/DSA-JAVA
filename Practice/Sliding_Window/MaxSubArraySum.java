package Sliding_Window;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        System.out.println(MaxSubArraySum.fixedWindowSum(arr, k));
        // int windowSum = 0;
        // int maxSum = 0;

        // for (int i = 0; i < arr.length; i++) {
        // windowSum += arr[i];

        // if (i >= k - 1) {
        // maxSum = Math.max(maxSum, windowSum);
        // windowSum -= arr[i - (k - 1)];
        // }
        // }

        // System.out.println(maxSum);
    }

    private static int fixedWindowSum(int[] arr, int k) {

        // int[] arr = { 2, 1, 5, 1, 3, 2 };

        int sum = 0;
        int maximumSum = 0;

        int left = 0;
        int right = k - 1;

        while (left <= right && right < arr.length) {
            sum += arr[left];

            if (left >= k - 1) {
                maximumSum = Math.max(maximumSum, sum);
                sum -= arr[left - k + 1];
            }
            if (right < arr.length - 1) {
                right++;
                System.out.println(right);
            }
            left++;
        }
        return maximumSum;
    }
}
