package InputFormating;

import java.util.Arrays;

public class BracketOutput {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        String str = "[";

        // System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "]";
                // System.out.println(arr[i] + "]");
            } else {
                str += arr[i] + ", ";
                // System.out.print(arr[i] + ", ");
            }
        }

        System.out.println(str);

        System.out.println(Arrays.toString(arr));
    }
}
