package InputFormating;

import java.util.Arrays;

public class FractionInput {
    public static void main(String[] args) {
        String str = "1/2 3/4";

        str = str.replaceAll("\\/|\\ ", " ");

        String[] nums = str.split(" ");

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
