package Other;

class Solution {
    public int removeDuplicates(int[] nums) {
        int duplicate_count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                duplicate_count++;
            }
        }
        return duplicate_count;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 2, 2, 3, 3, 4 };
        Solution sol = new Solution();
        System.out.println(sol.removeDuplicates(nums));
    }
}
