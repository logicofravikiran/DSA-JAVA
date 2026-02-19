package CompanyWise.IBM;
/*Count Duplicate Characters**

**Task:**
Count characters that repeat in a string.

Example:

```
Input: “programming”
Output: {r:2, g:2, m:2} */

import java.util.HashMap;

public class CountDuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(countOfDuplicateChars(str));
    }

    private static int countOfDuplicateChars(String str) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
        for (Integer i : map.values()) {
            if (i > 1) {
                count++;
            }
        }
        return count;
    }
}
