package Naive_Practice;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 111, 331, 2, 4, 1, 4, 5, 6, 3, 6, 8, 3, 32, 31 };
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int max = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < max) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
