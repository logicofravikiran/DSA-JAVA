package Arrays_Folder.Normal_Questions;
/*Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 

Constraints:

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
 

Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)). */

public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        minSubArrayLen(target, nums);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                System.out.println("------------- " + i + " && " + j + " -------------");
                sum += nums[j];
                if (sum == target) {
                    minLength = j - i + 1;
                    break;
                } else if (sum > target) {
                    break;
                }
            }
            System.out.println("MinLength:- " + minLength);
        }
        return 0;
    }
}
