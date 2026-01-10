package PrepCO.Recursion;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(maxElement(arr, arr.length - 1));
    }

    private static int maxElement(int[] arr, int index) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        if (index == 0) {
            return arr[index];
        }

        return Math.max(arr[index], maxElement(arr, index - 1));
    }
}
