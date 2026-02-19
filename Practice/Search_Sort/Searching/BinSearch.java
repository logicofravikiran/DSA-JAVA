package Search_Sort.Searching;

public class BinSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 8, 9 };
        int target = 1;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            System.out.println("while start:- " + arr[start] + " ,mid:- " + arr[mid] + " ,end:- " + arr[end]);

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                if (arr[start] == target) {
                    return start;
                } else {
                    start = mid + 1;
                }
            } else if (target < arr[mid]) {
                if (arr[start] == target) {
                    return start;
                } else {
                    end = mid - 1;
                }
            }
            mid = (start + (end - start)) / 2;
        }
        return -1;
    }
}
