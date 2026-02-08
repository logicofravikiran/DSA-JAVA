package Arrays_Folder.Normal_Questions;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int prefixProduct = 1;
        int suffixProduct = 1;

        int[] productArr = new int[nums.length];

        int index = nums.length - 1;

        int[] suffixProductArr = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                suffixProduct = 1;
            } else {
                suffixProduct *= nums[index];
                index--;
            }
            suffixProductArr[i] = suffixProduct;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefixProduct = 1;

            } else {
                prefixProduct *= nums[i - 1];
            }

            productArr[i] = prefixProduct * suffixProductArr[i];
            System.out.println(prefixProduct);
        }
        return productArr;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(ProductOfArrayExceptSelf.productExceptSelf(nums)));
    }
}
