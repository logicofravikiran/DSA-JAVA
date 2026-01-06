package Arrays_Folder.Normal_Questions;

import java.util.Arrays;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i - 1]);
            System.out.println((nums[nums.length - 1] - nums[i]));
            if (nums[i - 1] == (nums[nums.length - 1] - nums[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));
        // pivotIndex(nums);
    }
}
