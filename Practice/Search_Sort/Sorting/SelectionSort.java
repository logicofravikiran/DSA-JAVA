package Search_Sort.Sorting;

import java.util.Arrays;

public class SelectionSort {
    int smallestInx = 0;

    public static void main(String[] args) {
        int arr[] = { 6, 5, 4, 3, 2, 1 };
        SelectionSort ss = new SelectionSort();
        int sortedArr[] = ss.selectionSort(arr);
        // System.out.println("count:- " + ss.count);
        // System.out.println(ss.smallest);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(sortedArr[i]);
        }
    }

    public int[] selectionSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            smallestInx = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[i]) {
                    smallestInx = j;
                }
                temp = arr[i];
                arr[i] = arr[smallestInx];
                arr[smallestInx] = temp;
            }
            System.out.println(Arrays.toString(arr));

        }
        return arr;
    }
}
