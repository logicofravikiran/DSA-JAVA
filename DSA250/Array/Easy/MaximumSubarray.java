package DSA250.Array.Easy;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = { 1 };
        System.out.println(maxSubarray(arr));

    }

    private static int maxSubarray(int[] arr) {

        int index = 0;
        int p = 1;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (index < arr.length && p < arr.length) {
            sum += arr[p];
            max = Math.max(max, sum);
            if (p == arr.length - 1) {
                index++;
                p = index + 1;
                sum = 0;
            } else {
                p++;
            }
            System.out.println("sum:- " + sum + ", max:- " + max);
        }
        return max;
    }
}
