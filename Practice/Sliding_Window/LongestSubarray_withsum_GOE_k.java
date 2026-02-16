package Sliding_Window;

public class LongestSubarray_withsum_GOE_k {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 7, 10 };
        int k = 14;
        System.out.println(lengthOfSubarraywithSumK(arr, k));
    }

    private static int lengthOfSubarraywithSumK(int[] arr, int k) {

        int sum = 0;
        int right = 0;
        int length = 0;
        int maxLength = Integer.MIN_VALUE;
        int left = 0;
        while (left <= right && right < arr.length) {
            sum += arr[right];
            if (sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum <= k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }
        return maxLength;
    }

}
