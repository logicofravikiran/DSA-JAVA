package Arrays_Folder.Normal_Questions;

public class LargestSmallestElementArr {
    public static void main(String[] args) {
        int arr[] = { 1, 6, 8, 9, 2, 5, 7, 9, 11 };
        System.out.println("Largest Element:- " + largestEle(arr));
        System.out.println("Largest Element:- " + smallesEle(arr));
    }

    static int largestEle(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int smallesEle(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}