package Core2web.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
        int temp = 0;
        int n = arr.length - 1;
        for (int i = 0; i <= n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i];
            arr[n - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
