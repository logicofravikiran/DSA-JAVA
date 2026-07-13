package PrepCO.Arrays;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        int target = 7;

        System.out.println(combinations(arr, target));
    }

    private static List<List<Integer>> combinations(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        // Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(nums[i]);
            int sum = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > (target - sum)) {
                    if (sum == target) {
                        set.add(list);
                        break;
                    } else if (sum > target) {
                        sum -= list.getLast();
                        list.removeLast();
                        // break;
                    } else {
                        sum += nums[j];
                        list.add(nums[j]);
                    }
                } else {
                    sum += nums[i];
                    list.add(nums[i]);
                    j--;
                }
                System.out.println("list: - " + list);
            }
            System.out.println(set);
        }
        return new ArrayList<>(set);
    }

}
