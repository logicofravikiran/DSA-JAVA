//* Striver sliding window playlist

package Sliding_Window;

public class MaximumPointsFromCards {
    public static void main(String[] args) {
        int[] arr = { 6, 2, 3, 4, 7, 2, 1, 7, 1 };
        int k = 4;
        System.out.println(maxPointFromCards(arr, k));
    }

    private static int maxPointFromCards(int[] arr, int k) {
        int leftSum = 0;
        int rightSum = 0;
        int left = k - 1;
        int right = arr.length - 1;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            leftSum += arr[i];
        }

        for (int i = 0; i < k; i++) {
            maxSum = Math.max(maxSum, leftSum + rightSum);
            System.out.println("maxSum:- " + maxSum);
            leftSum -= arr[left];
            rightSum += arr[right];
            System.out.println("Leftsum: " + leftSum + " rightsum:- " + rightSum);
            left--;
            right--;
        }
        return maxSum;
    }
}
