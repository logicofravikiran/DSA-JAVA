package Sliding_Window;

public class Minimum_Size_Subarray_Sum {
    private static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        int right = 0;
        while (left <= right && right < nums.length) {
            System.out.println(nums[right] + "iteration");
            sum += nums[right];
            if (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);

            }
            while (sum > target) {
                sum -= nums[left];
                System.out.println("in if sum : - " + sum + " minlength:- " + minLength);
                left++;
            }
            if (!(right == nums.length - 1)) {

                right++;
            }
            System.out.println("----------------------");
        }
        return minLength;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        System.out.println("Final answer : - @@@@@@@@@@@@@@@ " + Minimum_Size_Subarray_Sum.minSubArrayLen(7, nums));
    }
}
