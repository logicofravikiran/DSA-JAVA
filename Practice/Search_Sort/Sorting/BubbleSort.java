package Arrays_Folder.Sorting;

public class BubbleSort {
    int count = 0;

    public int[] bubbleSort(int[] arr) {
        count = 0;
        int temp = 0;
        boolean isSwap = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                count++;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) { // array is already sorted
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 4, 3, 2, 1 };
        BubbleSort bs = new BubbleSort();
        int sortedArr[] = bs.bubbleSort(arr);
        System.out.println("count:- " + bs.count);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(sortedArr[i]);
        }
    }
}
