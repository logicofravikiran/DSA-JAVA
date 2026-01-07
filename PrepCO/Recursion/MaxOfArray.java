package PrepCO.Recursion;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = { 9894, 83, 93, 92, 01, 48, 29, 01, 01, 56789 };
        maxElement(arr, arr.length);
    }

    private static int maxElement(int[] arr, int index) {
        int max = maxElement(arr, index);
        if (index == -1) {
            return max;
        }
        if (maxElement(arr, index - 1) > max) {
            return maxElement(arr, index - 1);
        }
        return max;
    }
}
