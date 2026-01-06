
import java.util.Arrays;

public class chatDuplicateEle {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index of the last unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
                System.out.println(nums[uniqueIndex] + "uni");
            }
        }

        return uniqueIndex + 1; // Length of unique elements
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3, 3, 4 };

        int newLength = removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + newLength);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
