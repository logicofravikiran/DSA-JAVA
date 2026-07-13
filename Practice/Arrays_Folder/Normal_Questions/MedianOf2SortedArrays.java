package Arrays_Folder.Normal_Questions;

import java.util.Arrays;

public class MedianOf2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2 };
        int[] arr2 = { 3, 4 };
        int m = arr1.length - 1;
        int n = arr2.length - 1;
        System.out.println(medianOfArrays(arr1, arr2, m, n));
    }

    private static double medianOfArrays(int[] arr1, int[] arr2, int m, int n) {

        int[] result = new int[m + n + 2];
        int i = 0;
        int j = 0;

        for (int index = 0; index < result.length; index++) {

            if (index <= m) {
                result[index] = arr1[i];
                i++;
            } else {
                result[index] = arr2[j];
                j++;
            }
        }

        System.out.println(Arrays.toString(result));
        int sum = 0;
        for (int j2 = 0; j2 < result.length; j2++) {
            sum += result[j2];
        }

        double median = (double) (sum / result.length);

        return median;
    }

}
