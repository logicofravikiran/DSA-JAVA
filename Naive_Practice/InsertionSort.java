package Naive_Practice;

//! Remaining
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 8, 3, 1, 2 };
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        int currentIndex = 1;
        int current = arr[currentIndex];
        int prevIndex = 0;
        // int temp = 0;

        while (current < arr.length) {
            if (arr[currentIndex] < arr[prevIndex]) {
                arr[currentIndex] = arr[prevIndex];
                if (prevIndex != 0) {
                    prevIndex--;
                }
            }
        }
    }
}
