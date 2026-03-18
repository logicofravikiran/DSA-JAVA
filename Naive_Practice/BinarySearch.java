package Naive_Practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 89 };
        int target = 90;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            System.out.println("---");
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                if (target == arr[start]) {
                    return start;
                } else {
                    start++;
                    end = mid - 1;
                }
            } else if (target > arr[mid]) {
                if (target == arr[end]) {
                    return end;
                } else {
                    end--;
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
