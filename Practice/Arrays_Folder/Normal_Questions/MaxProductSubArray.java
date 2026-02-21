package Arrays_Folder.Normal_Questions;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] arr = { -1, -2, -3 };
        System.out.println(maxProductOfSubArray(arr));
    }

    private static int maxProductOfSubArray(int[] arr) {

        int left = 0;
        int right = 0;
        int product = 1;
        int maxProd = Integer.MIN_VALUE;
        while (right < arr.length) {
            System.out.println("max:- " + maxProd + ", Prod:- " + product);
            product *= arr[right];
            if (product > maxProd) {
                maxProd = Math.max(maxProd, product);
            }
            right++;
            if (right == arr.length && left < arr.length - 1) {
                left++;
                product = 1;
                right = left;
            }
        }
        return maxProd;
    }
}