package PrepCO.Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int index = arr.length - 1;
        displayReverseArray(arr, index);
    }

    private static void displayReverseArray(int[] arr, int index) {
        if (index == -1) {
            return;

        }
        System.out.println(arr[index]);
        displayReverseArray(arr, index - 1);
    }
}
