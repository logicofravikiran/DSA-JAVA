package Arrays_Folder;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        int max = maxProduct(arr);
        System.out.println(max);
    }

    private static int maxProduct(int[] arr) {
        int suffix = 1;
        int prefix = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (suffix == 0) {
                suffix = 1;
            }
            if (prefix == 0) {
                prefix = 1;
            }
            prefix *= arr[i];
            suffix *= arr[arr.length - i - 1];

            max = Math.max(max, Math.max(prefix, suffix));

        }
        return max;
    }
}
