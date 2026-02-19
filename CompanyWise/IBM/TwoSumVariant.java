package CompanyWise.IBM;
/*Two Sum Variant

(not exactly LeetCode)**

**Task:**
Find any pair of numbers that add up to the target.

Example:

```
Input: [2, 7, 11, 15], target = 9  
Output: [0, 1]
```

Important: They usually ask **any correct pair**. */

import java.util.Arrays;

public class TwoSumVariant {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 6;
        System.out.println(Arrays.toString(twoSumPair(arr, target)));
    }

    private static int[] twoSumPair(int[] arr, int target) {

        int[] result = { -1, -1 };
        if (arr.length <= 1) {
            return result;
        }
        int index = 0;
        // for (int i = 0; i < arr.length; i++) {

        // for (int j = i + 1; j < arr.length; j++) {
        // System.out.println("i:- " + i + " j" + j);

        // if ((arr[i] + arr[j]) == target) {

        // result[index] = i;
        // result[index + 1] = j;

        // return result;
        // }
        // }
        // }
        int left = 0;
        int right = 1;
        while (left <= right) {
            if (arr[left] + arr[right] == target) {
                result[0] = left;
                result[1] = right;
                return result;
            }
            right++;
            if (right == arr.length) {
                left++;
                right = left + 1;
            }
        }
        return new int[2];
    }
}
