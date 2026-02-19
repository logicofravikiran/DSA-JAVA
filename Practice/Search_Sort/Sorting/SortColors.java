package Search_Sort.Sorting;

import java.util.Arrays;

public class SortColors {
    /*
     * Given an array nums with n objects colored red, white, or blue, sort them
     * in-place so that objects of the same color are adjacent, with the colors in
     * the order red, white, and blue.
     * 
     * We will use the integers 0, 1, and 2 to represent the color red, white, and
     * blue, respectively.
     * 
     * You must solve this problem without using the library's sort function.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [2,0,2,1,1,0]
     * Output: [0,0,1,1,2,2]
     * Example 2:
     * 
     * Input: nums = [2,0,1]
     * Output: [0,1,2]
     * 
     * 
     * Constraints:
     * 
     * n == nums.length
     * 1 <= n <= 300
     * nums[i] is either 0, 1, or 2.
     * 
     * 
     * Follow up: Could you come up with a one-pass algorithm using only constant
     * extra space?
     */

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sortColors(arr);
    }

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = 0; j < arr.length - i - 1; j++) {

    // if (arr[j] > arr[j + 1]) {
    // arr[j + 1] = arr[j + 1] + arr[j];
    // arr[j] = arr[j + 1] - arr[j];
    // arr[j + 1] = arr[j + 1] - arr[j];
    // }
    // }
    // }
    // int zeroCount = 0;
    // int oneCount = 0;
    // int twoCount = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i]==0) {
    // zeroCount++;
    // } else if(arr[i]==1){
    // oneCount++;
    // }else{
    // twoCount++;
    // }
    // }

    // for (int i = 0; i < arr.length; i++) {

    // }
}
