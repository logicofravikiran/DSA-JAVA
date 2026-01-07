package PrepCO.Recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int index = arr.length - 1;
        displayArray(arr, index);
    }

    private static void displayArray(int[] arr, int index) {
        if (index == -1) {
            return;
        }
        displayArray(arr, index - 1);
        System.out.println(arr[index]);
    }
}
