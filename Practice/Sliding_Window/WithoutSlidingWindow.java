package Sliding_Window;

public class WithoutSlidingWindow {
    public static void main(String[] args) {
        MaxSubArraySumWOSlidingWindow obj = new MaxSubArraySumWOSlidingWindow();
        int[] arr = { 2 };
        System.out.println(
                obj.maxSum(arr, 3));
    }
}

class MaxSubArraySumWOSlidingWindow {
    public int maxSum(int[] arr, int k) {
        int max = 0;
        if (arr.length == 0 || arr.length < k) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            System.out.print("[" + arr[i] + ",");
            for (int j = i + 1; j < k && j < arr.length; j++) {
                // System.out.println();
                sum += arr[j];
                if (sum > max) {
                    max = sum;

                }
                System.out.print(arr[j] + ",");
            }
            System.out.print("]");
            System.out.println("max:- " + max);
            System.out.println("---------------------");
            k++;
        }
        return max;
    }
}
