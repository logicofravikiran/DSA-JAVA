package CompanyWise.IBM;

import java.util.Arrays;

/* Array: First Unique Element Index**

**Task:**
Given an array, return index of first non-repeating element.

Example:

```
Input: [2, 3, 2, 4, 3]
Output: 3  (because 4 is first unique) */

public class firstUniqueElement_Array {

    public static void main(String[] args) {
        int[] arr = { 1 };
        System.out.println(nonDuplicate(arr));
    }

    public static int nonDuplicate(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int unique = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                unique = arr[i];
            }
            if (arr[i] == arr[i - 1]) {
                unique = -1;
            }
        }
        // System.out.println();
        return unique;
    }
}
