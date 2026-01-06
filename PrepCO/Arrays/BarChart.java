package PrepCO.Arrays;

public class BarChart {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 7, 3, 4 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxNum = max;
        for (int i = 0; i < maxNum; i++) {
            // System.out.println(Arrays.toString(arr));
            for (int m = 0; m < arr.length; m++) {
                if (arr[m] > max) {
                    max = arr[m];
                }
            }
            // System.out.println(max);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == max) {
                    System.out.print("*\t");
                    arr[j] = arr[j] - 1;
                    // System.out.println(arr[j]);
                    // max = arr[j];
                } else {
                    System.out.print(" \t");
                }
                // System.out.println(Arrays.toString(arr));
            }
            // System.out.println(max);
            max--;
            System.out.println();
        }
    }
}
